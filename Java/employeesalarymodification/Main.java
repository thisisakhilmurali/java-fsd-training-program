package employeesalarymodification;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("20001", "Tony", 150000);
        Employee employeeTwo = new Employee("20002", "Mike", 70000);
        Employee employeeThree = new Employee("20003", "Jack", 75000);
        Employee employeeFour = new Employee("20004", "Ryan", 140000);
        Employee employeeFive = new Employee("20005", "Dom", 14000);

        List<Employee> myEmployees = new ArrayList<>();
        myEmployees.add(employeeOne);
        myEmployees.add(employeeTwo);
        myEmployees.add(employeeThree);
        myEmployees.add(employeeFour);
        myEmployees.add(employeeFive);

        // Anonymous Class Comparator
        Comparator<Employee> compareSalary = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.employeeSalary < o2.employeeSalary)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(myEmployees, compareSalary);

        System.out.println("Last Salary");

        for(Employee e: myEmployees) {
            System.out.println(e.employeeName + ": " + e.employeeSalary);
        }

        System.out.println("----------------------------");


        for(Employee e : myEmployees) {
            if(e.employeeSalary >= 50000 && e.employeeSalary <= 100000){
                double newSalary10Percent = (e.employeeSalary + (e.employeeSalary * 10) / 100);
                e.setEmployeeSalary(newSalary10Percent);
            } else if (e.employeeSalary < 50000) {
                e.setEmployeeSalary(e.employeeSalary);
            } else if (e.employeeSalary > 100000) {
                double newSalary5Percent = (e.employeeSalary + (e.employeeSalary * 5) / 100);
                e.setEmployeeSalary(newSalary5Percent);
            }
        }

        System.out.println("Current Salary");
        for(Employee e: myEmployees) {
            System.out.println(e.employeeName + ": " + e.employeeSalary);
        }

    }
}
