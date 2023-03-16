package org.employee.cexception.email;

public class EmailChecker {
    public static void validateEmail(String emailId) throws InvalidEmailException {
        if (emailId.isEmpty() || (!emailId.contains("@")))
            throw new InvalidEmailException("Enter a valid email id");
    }
}
