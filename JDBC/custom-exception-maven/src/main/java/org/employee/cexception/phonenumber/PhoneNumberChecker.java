package org.employee.cexception.phonenumber;

public class PhoneNumberChecker {
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if(phoneNumber.length()!=10)
            throw new InvalidPhoneNumberException("Phone number should be 10 digits");
        else
            System.out.println("Phone number is validated");
    }
}
