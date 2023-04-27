package insertionsort;

import java.util.Scanner;


public class InsertionSortMain {
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

        // Insertion sorting
        insertionSort(myArray);


        // After Sorting (Array State)
        System.out.println("\nAfter Sorting: (Insertion Sort)");
        for (int index = 0; index < sizeOfArray; index++) {
            System.out.print(myArray[index] + " ");
        }

    }

    private static void insertionSort(int[] myArray) {
        int sizeOfArray = myArray.length;
        for (int j = 1; j < sizeOfArray; j++) {
            int key = myArray[j];
            int i = j-1;
            while ( (i > -1) && ( myArray [i] > key ) ) {
                myArray [i+1] = myArray [i];
                i--;
            }
            myArray[i+1] = key;
        }
    }
}
