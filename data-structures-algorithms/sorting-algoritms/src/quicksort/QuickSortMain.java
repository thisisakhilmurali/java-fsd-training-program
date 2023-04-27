package quicksort;

import java.util.Scanner;

public class QuickSortMain {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

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

        // Quicksort sorting
        quickSort(myArray, 0, myArray.length - 1);


        // After Sorting (Array State)
        System.out.println("\nAfter Sorting: (Quick Sort)");
        for (int index = 0; index < sizeOfArray; index++) {
            System.out.print(myArray[index] + " ");
        }

    }
}
