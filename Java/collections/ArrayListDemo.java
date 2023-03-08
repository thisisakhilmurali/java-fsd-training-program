package collections;

import java.util.*;
public class ArrayListDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int index = 0; index < 5; index++) {
            System.out.print("Enter the element: ");
            myArray.add(sc.nextInt());
        }
        for (Integer index:myArray) {
            System.out.println(index);
        }
    }
}