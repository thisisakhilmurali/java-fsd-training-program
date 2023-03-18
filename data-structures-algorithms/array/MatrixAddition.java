package array;

import java.util.Scanner;

public class MatrixAddition {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // dimensions of first matrix
        System.out.print("Enter row size of first matrix: ");
        int rowSizeOfFirstMatrix = sc.nextInt();
        System.out.print("Enter column size of first matrix: ");
        int columnSizeOfFirstMatrix = sc.nextInt();

        // dimensions of second matrix
        System.out.print("Enter row size of second matrix: ");
        int rowSizeOfSecondMatrix = sc.nextInt();
        System.out.print("Enter column size of second matrix: ");
        int columnSizeOfSecondMatrix = sc.nextInt();
        
        
        // checking the condition for matrix addition (m1==m2 && c1==c2)
        if(rowSizeOfFirstMatrix==rowSizeOfSecondMatrix && columnSizeOfFirstMatrix==columnSizeOfSecondMatrix) {

            int[][] firstMatrix = new int[rowSizeOfFirstMatrix][columnSizeOfFirstMatrix];
            int[][] secondMatrix = new int[rowSizeOfSecondMatrix][columnSizeOfSecondMatrix];

            // entering the elements for first matrix
            System.out.println("Enter the elements of first matrix");
            for (int row = 0; row < rowSizeOfFirstMatrix; row++) {
                for (int col = 0; col < columnSizeOfFirstMatrix; col++) {
                    System.out.print("Enter the element at position [" + row + "][" + col + "] : ");
                    firstMatrix[row][col] = sc.nextInt();
                }
            }
            
            // entering the elements for second matrix
            System.out.println("\nEnter the elements of second matrix");
            for (int row = 0; row < rowSizeOfSecondMatrix; row++) {
                for (int col = 0; col < columnSizeOfSecondMatrix; col++) {
                    System.out.print("Enter the element at position [" + row + "][" + col + "] : ");
                    secondMatrix[row][col] = sc.nextInt();
                }
            }

            // matrix addition
            int[][] sumOfMatrices = addTheTwoMatrices(firstMatrix, secondMatrix);

            // printing the sum of matrices
            System.out.println("Sum of matrices");
            for (int row = 0; row < rowSizeOfFirstMatrix; row++) {
                for (int col = 0; col < columnSizeOfFirstMatrix; col++) {
                    System.out.print(sumOfMatrices[row][col] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Matrix Addition not possible. Please cross check the dimensions.");
    }

    // function to calculate the sum of two matrices
    public static int[][] addTheTwoMatrices(int[][] firstMatrix, int[][] secondMatrix){
        
        int[][] sumOfTwoMatrices = new int[firstMatrix.length][secondMatrix.length];

        for (int indexOfFirst = 0; indexOfFirst < firstMatrix.length; indexOfFirst++) {
            for (int indexOfSecond = 0; indexOfSecond < secondMatrix.length; indexOfSecond++) {
                sumOfTwoMatrices[indexOfFirst][indexOfSecond] = firstMatrix[indexOfFirst][indexOfSecond] + secondMatrix[indexOfFirst][indexOfSecond];
            }
        }
        return sumOfTwoMatrices;
    }
}
