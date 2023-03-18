package org.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Importing custom exception classes

import org.employee.cexception.address.InvalidAddressException;
import org.employee.cexception.location.InvalidLocationException;
import org.employee.cexception.phonenumber.InvalidPhoneNumberException;
import org.employee.cexception.email.InvalidEmailException;
import org.employee.cexception.eid.InvalidEidException;
import org.employee.cexception.name.InvalidNameException;
import org.employee.cexception.salary.InvalidSalaryException;

import static org.employee.cexception.address.AddressChecker.validateAddress;
import static org.employee.cexception.location.LocationChecker.validateLocation;
import static org.employee.cexception.phonenumber.PhoneNumberChecker.validatePhoneNumber;
import static org.employee.cexception.email.EmailChecker.validateEmail;
import static org.employee.cexception.eid.EidChecker.validateEid;
import static org.employee.cexception.name.NameChecker.validateName;
import static org.employee.cexception.salary.SalaryChecker.validateSalary;

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
            if (userChoice == 1) {

                sc.nextLine();

                System.out.print("Enter EID: ");
                String eId = sc.nextLine();

                // custom exception to validate eid
                try {
                    validateEid(eId);
                } catch (InvalidEidException e) {
                    System.out.println(e);
                    continue;
                }

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                // custom exception to validate name
                try {
                    validateName(name);
                } catch (InvalidNameException e) {
                    System.out.println(e);
                    continue;
                }

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                // custom exception to validate address
                try {
                    validateAddress(address);
                } catch (InvalidAddressException ex) {
                    System.out.println("EXCEPTION: " + ex);
                    continue;
                }

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

                // custom exception to validate location
                try {
                    validateLocation(location);
                } catch (InvalidLocationException ex) {
                    System.out.println("EXCEPTION: " + ex);
                    continue;
                }

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                // custom exception to validate salary
                try {
                    validateSalary(salary);
                } catch (InvalidSalaryException ex) {
                    System.out.println("EXCEPTION: " + ex);
                    continue;
                }

                // Creating employee instance
                Employee myEmployee = new Employee(phoneNumber, email, address, eId, name, location, salary);

                // sending to database
                DatabaseUpdation.updateCandidateDetails(myEmployee);


            } else if (userChoice == 2) {
                System.exit(1);
            } else {
                System.out.println("Please enter a valid choice from the menu");
            }
        }
    }
}