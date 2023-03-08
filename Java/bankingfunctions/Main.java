package bankingfunctions;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Customer tom = new Customer(98765765, "Tom", "tom234@yahoo.com");
        Savings account = new Savings(435463, tom, 1000, 100);

        Scanner sc = new Scanner(System.in);

        double withdrawAmount = sc.nextDouble();

        String status = account.withdraw(withdrawAmount) ? "TRANSACTION SUCCESSFUL" : "TRANSACTION FAILED";

        System.out.println("Details of " + tom.getCustomerName());
        System.out.println("Withdraw Status: " + status);
        System.out.println("Withdraw Amount: " + withdrawAmount);
        System.out.println("Balance Amount: " + account.getBalance());

    }
}