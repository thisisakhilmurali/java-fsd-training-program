package array;

import java.util.Scanner;

public class ArrayDemo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the size of array: ");
        int sizeOfArray = sc.nextInt();

        int[] theArray = new int[sizeOfArray];

        // entering the elements
        for (int index = 0; index < sizeOfArray; index++) {
            System.out.print("Enter element at position " + index + ": ");
            theArray[index] = sc.nextInt();
        }

        // getting odd numbers and even numbers from array
        for (int index = 0; index < sizeOfArray; index++) {
            if (theArray[index] % 2 == 0)
                System.out.println(theArray[index] + " Even");
            else
                System.out.println(theArray[index] + " Odd");
        }

    }
}
