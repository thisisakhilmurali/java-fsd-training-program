package org.example;

public class Employee {
    private final int yearsWorked;
    private double salaryOfEmployee;

    public Employee(int yearsWorked, double salaryOfEmployee) {
        this.yearsWorked = yearsWorked;
        this.salaryOfEmployee = salaryOfEmployee;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }
    public double getSalaryOfEmployee() {
        return salaryOfEmployee;
    }
    public void setSalaryOfEmployee(double salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }
}
