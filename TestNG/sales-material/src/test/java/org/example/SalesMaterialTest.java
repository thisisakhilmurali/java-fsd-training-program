package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalesMaterialTest {
    @Test
    public void testThePricePerSquareFeet() {

        List<SalesMaterial> theSalesData = new ArrayList<>();

        theSalesData.add(new SalesMaterial("TVM", 1600, 800));
        theSalesData.add(new SalesMaterial("Chennai", 1800, 1000));
        theSalesData.add(new SalesMaterial("Hyderabad", 2000, 900));
        theSalesData.add(new SalesMaterial("Mumbai", 2500, 1200));
        theSalesData.add(new SalesMaterial("Cochin", 1800, 1200));


        String userGivenCity = "TVM";
        double userGivenSquareFeet = 2;

        List myPriceList = theSalesData.stream()
                .filter(val -> val.getNameOfCity().equalsIgnoreCase(userGivenCity))
                .map(val -> val.getThePriceOnSquareFeet(userGivenSquareFeet)).collect(Collectors.toList()).get(0);

        double totalAmount = theSalesData.stream()
                .filter(val -> val.getNameOfCity().equalsIgnoreCase(userGivenCity))
                .map(val -> val.getThePriceOnSquareFeet(userGivenSquareFeet))
                .collect(Collectors.toList()).get(0).stream().mapToDouble(f -> (double) f).sum();

        System.out.println("Location: " + userGivenCity);
        System.out.println("Square Feet: " + userGivenSquareFeet);
        System.out.println("Price with material : " + myPriceList.get(0));
        System.out.println("Price without material : " + myPriceList.get(1));
        System.out.println("Total amount: " + totalAmount);

        String myCity = "TVM";
        double squareFeet = 2;
        List<Double> priceList = Arrays.asList(3200.0, 1600.0);
        double totalExpected = 4800.0;

        Assert.assertEquals(myPriceList, priceList);
        Assert.assertEquals(totalAmount, totalExpected);

    }
}
