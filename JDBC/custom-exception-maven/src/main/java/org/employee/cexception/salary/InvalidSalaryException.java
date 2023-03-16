package org.employee.cexception.salary;

public class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String str) {
        super(str);
    }
}
