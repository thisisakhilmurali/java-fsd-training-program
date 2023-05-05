/*

2 -> abc
3 -> def
4 -> ghi
5 -> jkl
6 -> mno
7 -> pqrs
8 -> tuv
9 -> wxyz

0, 1 -> Invalid

 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Initiate the HashMap
        HashMap<Integer, String> hashMap = initiateTheDigitsAndAlphabets();

    }

    private static HashMap<Integer, String> initiateTheDigitsAndAlphabets() {
        HashMap<Integer, String> hashMap = new HashMap<>();

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = alphabets.toCharArray();

        int start = 0;
        int end = 3;

        for (int index = 2; index <= 9; index++) {

            String sub = "";

            if (index == 7 || index == 9) {

                end = start + 4;

                for (int y = start; y < end; y++) {
                    sub += alphabetArray[y];
                }

                start = end;
                end += 3;

                hashMap.put(index, sub);

                continue;
            }

            for (int y = start; y < end; y++) {
                sub += alphabetArray[y];
            }

            hashMap.put(index, sub);

            start = end;
            end = start + 3;

        }
        
        return hashMap;
    }
}
