package org.employee.cexception.location;

public class LocationChecker {
    public static void validateLocation(String location) throws InvalidLocationException {
        if(location.isEmpty())
            throw new InvalidLocationException("Please enter a valid location");
    }
}
