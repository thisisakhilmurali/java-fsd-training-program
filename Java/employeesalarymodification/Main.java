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

        myEmployees.forEach(val -> {
            System.out.println(val.employeeName + ": " + val.employeeSalary);
        });

        System.out.println("----------------------------------");

        myEmployees.forEach(val -> {
            if(val.employeeSalary >= 50000 && val.employeeSalary <= 100000){
                double newSalary10Percent = (val.employeeSalary + (val.employeeSalary * 10) / 100);
                val.setEmployeeSalary(newSalary10Percent);
            } else if (val.employeeSalary < 50000) {
                val.setEmployeeSalary(val.employeeSalary);
            } else if (val.employeeSalary > 100000) {
                double newSalary5Percent = (val.employeeSalary + (val.employeeSalary * 5) / 100);
                val.setEmployeeSalary(newSalary5Percent);
            }
        });

        System.out.println("Current Salary");
        for(Employee e: myEmployees) {
            System.out.println(e.employeeName + ": " + e.employeeSalary);
        }

    }
}
