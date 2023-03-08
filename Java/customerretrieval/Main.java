package customerretrieval;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<CustomersAreKings> customerList = new ArrayList<>();

        customerList.add(new CustomersAreKings("1000", "Mike", "01125033045","zakirovzzz@govnomail.xyz", "Leh"));
        customerList.add(new CustomersAreKings("1001", "Jack", "02224453327","gaston42@hotmail.com", "Indore"));
        customerList.add(new CustomersAreKings("1002", "Ryan", "03125033045","serena.schamberger43@hotmail.com", "Kochi"));
        customerList.add(new CustomersAreKings("1003", "Dom", "01625033045","ronny_terry@gmail.com", "Rajkot"));
        customerList.add(new CustomersAreKings("1004", "Jony", "018755044045","shad_brakus8@hotmail.com", "Noida"));
        customerList.add(new CustomersAreKings("1005", "Staten", "01425033045","luciano.borer@gmail.com", "Bangalore"));
        customerList.add(new CustomersAreKings("1006", "Ray", "01176033045","constantin79@gmail.com", "NCR"));
        customerList.add(new CustomersAreKings("1007", "Adam", "01345033045","jazmin.feeney99@yahoo.com", "TVM"));

        System.out.println(customerList);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the customer ID: ");
        String idLookUp = sc.nextLine();

        List<CustomersAreKings> foundList = customerList.stream()
                .filter(val -> val.getRegisterId().equals(idLookUp))
                .toList();

        if(foundList.isEmpty())
            System.out.println("No Records Found");
        else
            for(CustomersAreKings emp: foundList) {
                System.out.println("ID: " + emp.getRegisterId());
                System.out.println("Name: " + emp.getCustomerName());
                System.out.println("Contact Number: " + emp.getContactNumber());
                System.out.println("Contact Mail: " + emp.getContactMail());
                System.out.println("Location: " + emp.getLocation());
            }
    }
}