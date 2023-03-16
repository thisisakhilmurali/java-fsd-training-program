package org.employee.cexception.address;

public class InvalidAddressException extends Exception{
    public InvalidAddressException(String str) {
        super(str);
    }
}
