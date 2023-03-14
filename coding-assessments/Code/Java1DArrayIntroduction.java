import java.util.Scanner;

public class Java1DArrayIntroduction {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the size of array: ");
        int sizeOfArray = sc.nextInt();

        int[] myArray = new int[sizeOfArray];

        for (int index = 0; index < myArray.length; index++) {
            System.out.print("Enter element at " + index + ": ");
            myArray[index] = sc.nextInt();
        }

        System.out.println();

        for(int element: myArray){
            System.out.println(element);
        }

    }
}
