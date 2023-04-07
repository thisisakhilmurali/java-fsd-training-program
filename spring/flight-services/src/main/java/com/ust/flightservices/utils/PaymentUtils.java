package com.ust.flightservices.utils;

import com.ust.flightservices.exception.InsufficentAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();
    static {
        paymentMap.put("acc1", 20000.00);
        paymentMap.put("acc2", 15000.00);
        paymentMap.put("acc3", 25000.00);
        paymentMap.put("acc4", 4000.00);
        paymentMap.put("acc5", 45000.00);
        paymentMap.put("acc6", 90000.00);
        paymentMap.put("acc7", 2000.00);
        paymentMap.put("acc8", 30000.00);
    }
    public static boolean validateCreditLimit(String accountNumber, double fare) throws InsufficentAmountException {
        if(fare > paymentMap.get(accountNumber)) {
            throw new InsufficentAmountException("Insufficent Amount");
        }
        else {
            return true;
        }
    }
}
