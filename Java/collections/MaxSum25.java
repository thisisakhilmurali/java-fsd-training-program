package collections;

import java.util.ArrayList;
import java.util.Scanner;
public class MaxSum25 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        int first = 0;
        int second = 0;
        boolean isAvailable = false;

        System.out.println("Enter the elements");

        for (int index = 0; index < 10; index++) {
            System.out.print("Enter the Element ("+ (index + 1) +"): ");
            myArray.add(sc.nextInt());
        }

        for(int index = 0; index < 10; index++) {
            for (int sec_index = 1; sec_index < 10; sec_index++){
                if(myArray.get(index) + myArray.get(sec_index) == 25) {
                    first = myArray.get(index);
                    second = myArray.get(sec_index);
                    isAvailable = true;
                    break;
                }
                if(isAvailable)
                    break;
            }
        }

        if(isAvailable) {
            System.out.print("First Number: " + first);
            System.out.println();
            System.out.print("Second Number: " + second);
        } else {
            System.out.print("Invalid");
        }
    }
}
