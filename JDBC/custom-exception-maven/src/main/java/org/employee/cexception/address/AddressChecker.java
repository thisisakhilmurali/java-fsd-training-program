package org.employee.cexception.address;

public class AddressChecker {
    public static void validateAddress (String address) throws InvalidAddressException {
        if(address.isEmpty())
            throw new InvalidAddressException("Enter a valid address");
    }
}
