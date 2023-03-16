package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> myEmployeeList = new ArrayList<>();

        myEmployeeList.add(new Employee(2, 29000));
        myEmployeeList.add(new Employee(4, 67000));
        myEmployeeList.add(new Employee(7, 429000));
        myEmployeeList.add(new Employee(11, 729000));

        myEmployeeList.forEach(
                val -> {
                    if(val.getYearsWorked()>=1 && val.getYearsWorked()<=2) {
                        double newSalary = val.getSalaryOfEmployee() + (val.getSalaryOfEmployee() * 2.5 / 100);
                        val.setSalaryOfEmployee(newSalary);
                    } else if (val.getYearsWorked()>=3 && val.getYearsWorked()<=6) {
                        double newSalary = val.getSalaryOfEmployee() + (val.getSalaryOfEmployee() * 5.0 / 100);
                        val.setSalaryOfEmployee(newSalary);
                    } else if (val.getYearsWorked()>=7 && val.getYearsWorked()<=10) {
                        double newSalary = val.getSalaryOfEmployee() + (val.getSalaryOfEmployee() * 10.0 / 100);
                        val.setSalaryOfEmployee(newSalary);
                    } else if (val.getYearsWorked()>10) {
                        double newSalary = val.getSalaryOfEmployee() + (val.getSalaryOfEmployee() * 12.0 / 100);
                        val.setSalaryOfEmployee(newSalary);
                    }
                }
        );

        myEmployeeList.forEach(val ->
                System.out.println(val.getSalaryOfEmployee())
        );
    }
}
