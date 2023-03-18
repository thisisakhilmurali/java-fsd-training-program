package org.employee.cexception.eid;

public class InvalidEidException extends Exception{
    public InvalidEidException (String str){
        super(str);
    }
}