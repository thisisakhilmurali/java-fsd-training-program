import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        AmicableNumberFinder amicableNumber = new AmicableNumberFinder();

        System.out.print("Enter the number: ");
        int theNumber = sc.nextInt();

        int theOtherMe = amicableNumber.findTheOtherMe(theNumber);

        if(theOtherMe == -1)
            System.out.println("Not an Amicable Number");
        else
            System.out.println("The Other Me: " + theOtherMe);

    }
}
