package org.employee.cexception.phonenumber;

public class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String str) {
        super(str);
    }
}
