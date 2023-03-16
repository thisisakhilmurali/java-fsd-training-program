package org.employee.cexception.eid;

public class EidChecker {
    public static void validateEid(String eId) throws InvalidEidException {
        if (eId.length() != 6)
            throw new InvalidEidException("Error in UID");
    }
}
