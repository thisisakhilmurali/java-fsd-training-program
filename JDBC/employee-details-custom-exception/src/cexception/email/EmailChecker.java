package cexception.email;

public class EmailChecker {
    public static void validateEmail(String emailId) throws InvalidEmailException {
        if(emailId.contains("@"))
            System.out.println("Email is validated");
        else
            throw new InvalidEmailException("EMail ID format is incorrect");
    }
}
