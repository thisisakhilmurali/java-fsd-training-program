package maintanancechargecalculator;

import java.util.Scanner;
public class UserInterface {

    public static void main(String arg[]) {

        System.out.println("1.Savings Account\n2.Current Account");
        System.out.print("Enter your choice: ");

        Scanner sc = new Scanner(System.in);
        int choiceOfCustomer = sc.nextInt();

        if(choiceOfCustomer != 1 || choiceOfCustomer!= 2){
            System.out.println("Selection Not Found. Please contact your nearest branch.");
            System.exit(0);
        }

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.next();

        System.out.print("Enter Your Name: ");
        String cusName = sc.next();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Number of Year: ");
        int year = sc.nextInt();

        System.out.println();

        if(choiceOfCustomer == 1) {
            // Savings Account
            SavingsAccount acc = new SavingsAccount(accountNumber, cusName, balance);
            System.out.println("Customer Name: " + acc.getCustomerName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Account Balance: " + acc.getBalance());
            System.out.println("AMC: " + acc.calculateMaintananceCharge(year));
        } else if (choiceOfCustomer == 2) {
            // Current Account
            CurrentAccount acc = new CurrentAccount(accountNumber, cusName, balance);
            System.out.println("Customer Name: " + acc.getCustomerName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Account Balance: " + acc.getBalance());
            System.out.println("AMC: " + acc.calculateMaintananceCharge(year));
        }else {
            System.out.println("Selection Not Found. Please contact your nearest branch.");
        }
    }

}
