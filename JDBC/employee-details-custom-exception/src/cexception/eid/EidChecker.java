package cexception.eid;

import cexception.email.InvalidEmailException;

public class EidChecker {
    public static void validateEid(String eId) throws InvalidEidException {
        if(eId.length()!=6){
            throw new InvalidEidException("Error in UID");
        } else {
            System.out.println("UID Verified");
        }
    }
}
