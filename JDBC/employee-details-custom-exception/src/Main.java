import java.util.Scanner;

// Importing custom exception classes
import cexception.phonenumber.InvalidPhoneNumberException;
import static cexception.phonenumber.PhoneNumberChecker.validatePhoneNumber;

import cexception.email.InvalidEmailException;
import static cexception.email.EmailChecker.validateEmail;

import cexception.eid.InvalidEidException;
import static cexception.eid.EidChecker.validateEid;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nADDING NEW CANDIDATES");
            System.out.println("1. Enter a new candidate");
            System.out.println("2. Exit");
            System.out.print("Choice: ");

            int userChoice = sc.nextInt();

            // Getting candidate details
            if (userChoice == 1){

                sc.nextLine();

                System.out.print("Enter EID: ");
                String eId = sc.nextLine();

                // custom exception to validate eid
                try {
                    validateEid(eId);
                } catch (InvalidEidException e) {
                    System.out.println(e);
                }

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                System.out.print("Enter Phone: ");
                String phoneNumber = sc.nextLine();

                // custom exception to validate phone number
                try {
                    validatePhoneNumber(phoneNumber);
                } catch (InvalidPhoneNumberException ex) {
                    System.out.println("EXCEPTION: " + ex);
                    continue;
                }

                System.out.print("Enter Email: ");
                String email = sc.next();

                // custom exception to validate email
                try {
                    validateEmail(email);
                } catch (InvalidEmailException ex) {
                    System.out.println("EXCEPTION: " + ex);
                    continue;
                }

                System.out.print("Enter Location: ");
                String location = sc.next();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                // Creating employee instance
                Employee myEmployee = new Employee(phoneNumber, email, address, eId, name, location, salary);

                // sending to database
                DatabaseUpdation.updateCandidateDetails(myEmployee);


            } else if (userChoice == 2) {
                System.exit(1);
            }
            else {
                System.out.println("Please enter a valid choice from the menu");
            }
        }
    }
}