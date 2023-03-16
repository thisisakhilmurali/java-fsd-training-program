package org.employee.cexception.name;

public class NameChecker {
    public static void validateName(String name) throws InvalidNameException {
        if (name.isEmpty())
            throw new InvalidNameException("Please enter a valid name");
    }
}
