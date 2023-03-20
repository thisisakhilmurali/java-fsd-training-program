import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the first word: ");
        String firstWord = sc.nextLine();

        System.out.print("Enter the second word: ");
        String secondWord = sc.nextLine();

        boolean isAnagram = anagramChecker(firstWord, secondWord);

        if(isAnagram)
            System.out.println(firstWord + " and " + secondWord + " are anagrams");
        else
            System.out.println(firstWord + " and " + secondWord + " are NOT anagrams");
    }

    private static boolean anagramChecker(String firstWord, String secondWord) {

        // if length of two strings are not equal then certainly they are not anagrams
        if (firstWord.length() != secondWord.length())
            return false;

        // Hashmap to hold the count
        HashMap<Character, Integer> myMap = new HashMap<>();

        // Saving the character count of first string to the hashmap
        for (int index = 0; index < firstWord.length(); index++) {

            char character = firstWord.charAt(index);

            if (myMap.containsKey(character))
                myMap.put(character, myMap.get(character) + 1);
            else
                myMap.put(character, 1);
        }

        // Removing each element from the hashmap if they are present in the first string
        for (int index = 0; index < secondWord.length(); index++) {

            char character = secondWord.charAt(index);

            if (myMap.containsKey(character)) {
                if (myMap.get(character) == 1)
                    myMap.remove(character);
                else
                    myMap.put(character, myMap.get(character) - 1);
            }
            else
                return false;
        }

        // if the size of hashmap is zero, then both strings are anagrams
        return myMap.size() == 0;
    }
}