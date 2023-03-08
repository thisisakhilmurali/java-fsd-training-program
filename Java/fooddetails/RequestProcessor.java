package fooddetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RequestProcessor {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] ar) {

        // LeArabia Food List Creation
        LeArabia vegMeals = new LeArabia("1001", "Veg Meals", 80);
        LeArabia fishCurryMeals  = new LeArabia("1002", "Meals with Fish Curry", 120);
        LeArabia chappatiVegCurry = new LeArabia("1003", "Chappati with Veg Curry", 40);
        LeArabia chappatiChickenCurry = new LeArabia("1004", "Chappati with Chicken Curry", 120);
        LeArabia vegFriedRice = new LeArabia("1005", "Vegetable Fried Rice", 60);
        LeArabia chickenFriedRice = new LeArabia("1006", "Chicken Fried Rice", 150);

        List<LeArabia> theMenuForToday = new ArrayList<>();
        theMenuForToday.add(vegMeals);
        theMenuForToday.add(fishCurryMeals);
        theMenuForToday.add(chappatiVegCurry);
        theMenuForToday.add(chappatiChickenCurry);
        theMenuForToday.add(vegFriedRice);
        theMenuForToday.add(chickenFriedRice);

        // Employee list creation
        List<Employee> myEmployeeList = new ArrayList<>();

        // HashMap for UID x FoodID
        Map<String, List<String>> orderListForEmployees = new HashMap<>();

        while (true) {

            // Selection Menu
            System.out.println("\n----------------------------------");
            System.out.println("UST Restaurant Ops");
            System.out.println("SELECT AN OPERATION TO PERFORM");
            System.out.println("1. Create a User");
            System.out.println("2. Update a User");
            System.out.println("3. View a User");
            System.out.println("4. Delete a User");
            System.out.println("5. Exit the App");
            System.out.println("----------------------------------");

            System.out.print("Enter Choice: ");
            int choiceOfUser = sc.nextInt();

            // Program Exit Condition
            if(choiceOfUser == 5) {

                System.out.println("\nHave a nice day!");
                System.exit(1);

            }

            // Registering New Employee
            else if (choiceOfUser == 1) {

                Employee ustEmployee = new Employee();

                System.out.print("\nEnter the name of the new user: ");
                ustEmployee.setEmployeeName(sc.next());
                System.out.print("\nEnter the UID: ");
                ustEmployee.setUstId(sc.next());

                System.out.println("User Created Successfully");

                myEmployeeList.add(ustEmployee);

            }

            // Ordering Food
            else if (choiceOfUser == 2) {

                System.out.println("\nMENU - LeArabia\n");
                theMenuForToday.forEach(item -> {
                    System.out.println("ID: " + item.getFoodId() + " " + item.getFoodName());
                });

                System.out.print("\nEnter the UID: ");
                String uId = sc.next();

                List<String> foodIds = new ArrayList<>();

                while (true) {
                    System.out.print("Enter the FoodId: ");
                    foodIds.add(sc.next());
                    System.out.print("Anymore order ? (y/n): ");
                    String choiceYorN = sc.next();
                    if (choiceYorN.equals("n") || choiceYorN.equals("N"))
                        break;
                }

                orderListForEmployees.put(uId, foodIds);

                System.out.println("\nOrder Placed Successfully");

            }

            // Employee Lookup
            else if (choiceOfUser == 3) {

                System.out.print("\nEnter the UID for lookup: ");
                String uidValue = sc.next();
                String nameOfEmployee;

                if(orderListForEmployees.containsKey(uidValue)) {

                    // Extracting name of employee corresponding to UID
                    nameOfEmployee = myEmployeeList.stream()
                            .filter(val -> val.getUstId().equals(uidValue))
                            .map(Employee::getEmployeeName)
                            .toList()
                            .get(0);

                    System.out.println("Name of employee: " + nameOfEmployee);

                    // Display order details for employee
                    orderListForEmployees.forEach((key, value) -> {
                        if (key.equals(uidValue)) {
                            value.forEach(foodId -> {
                                theMenuForToday.forEach(foodRecord -> {
                                    if (foodRecord.getFoodId().equals(foodId))
                                        System.out.println("Food Item: " + foodRecord.getFoodName() + " | Price: " + foodRecord.getPriceOfFood());
                                });
                            });
                        }
                    });

                } else {
                    System.out.println("No Record Found");
                }

            }

            // Removing a record
            else if (choiceOfUser == 4) {

                System.out.print("\nEnter the UID for deletion: ");
                String uidToRemove = sc.next();

                orderListForEmployees.remove(uidToRemove);

                System.out.println("Removed Record " + uidToRemove);

            } else {
                System.out.println("\nPlease enter a valid choice next time");
            }
        }
    }
}


/*

APPENDIX

for(Employee e : myEmployeeList) {
    if(uidValue.equals(e.getUstId()))
        nameOfEmployee = e.getEmployeeName();
}

for(Map.Entry<String, List<String>> ee : orderListForEmployees.entrySet()){
   for(LeArabia la: theMenuForToday){
        for(String st: ee.getValue()){
            if(la.getFoodId().equals(st)){
                System.out.println("Food: " + la.getFoodName() + " | Price: " + la.getPriceOfFood());
            }
        }
    }
}

 */