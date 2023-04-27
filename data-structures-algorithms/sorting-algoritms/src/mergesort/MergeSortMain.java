package mergesort;


import java.util.Scanner;

public class MergeSortMain {

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {

        // Getting the size of the array
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        // Initializing the array
        int myArray[] = new int[sizeOfArray];

        // Entering the elements to array
        System.out.println("Enter the elements: ");
        for (int index = 0; index < sizeOfArray; index++) {
            myArray[index] = scanner.nextInt();
        }

        // Before Sorting (Array State)
        System.out.println("Before Sorting: ");
        printArray(myArray);

        // Merge sorting
        mergeSort(myArray, 0, myArray.length - 1);


        // After Sorting (Array State)
        System.out.println("\nAfter Sorting: (Merge Sort)");
        printArray(myArray);
    }
}

