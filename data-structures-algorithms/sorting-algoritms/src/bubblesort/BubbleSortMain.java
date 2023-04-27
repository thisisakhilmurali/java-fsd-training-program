package bubblesort;

import java.util.Scanner;

public class BubbleSortMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Getting the size of the array
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        // Initializing the array
        int myArray[] = new int[sizeOfArray];

        System.out.println("Enter the elements: ");
        // Entering the elements to array
        for (int index = 0; index < sizeOfArray; index++) {
            myArray[index] = scanner.nextInt();
        }

        // Before Sorting (Array State)
        System.out.println("Before Sorting: ");
        for (int index = 0; index < sizeOfArray; index++) {
            System.out.print(myArray[index] + " ");
        }

        // Bubble sorting
        bubbleSort(myArray);


        // After Sorting (Array State)
        System.out.println("\nAfter Sorting: (Bubble Sort)");
        for (int index = 0; index < sizeOfArray; index++) {
            System.out.print(myArray[index] + " ");
        }

    }

    private static void bubbleSort(int[] myArray) {
        int sizeOfArray = myArray.length;
        int temp = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 1; j < (sizeOfArray - i); j++) {
                if (myArray[j - 1] > myArray[j]) {
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }

}
