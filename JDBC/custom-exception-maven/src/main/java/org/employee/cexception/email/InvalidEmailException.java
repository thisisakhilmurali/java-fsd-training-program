package org.employee.cexception.email;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(String str) {
        super(str);
    }
}
