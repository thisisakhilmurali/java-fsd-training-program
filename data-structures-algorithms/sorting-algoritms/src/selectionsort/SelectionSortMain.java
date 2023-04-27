package selectionsort;

import java.util.Scanner;

public class SelectionSortMain {

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

        // Selection sorting
        selectionSort(myArray);


        // After Sorting (Array State)
        System.out.println("\nAfter Sorting: (Selection Sort)");
        for (int index = 0; index < sizeOfArray; index++) {
            System.out.print(myArray[index] + " ");
        }

    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

}
