package org.employee.cexception.salary;

public class SalaryChecker {
    public static void validateSalary(double salary) throws InvalidSalaryException {
        if(salary <= 5000) {
            throw new InvalidSalaryException("Please enter a valid salary");
        }
    }
}
