package org.employeecoin;

import java.time.LocalDate;

public class GoldCoinCalculator {

    public static void main(String[] args) {

        LocalDate hireDate = LocalDate.of(2023, 1, 1);
        LocalDate currentDate = LocalDate.of(2023, 3, 10);

        int daysWorked = (int) (currentDate.toEpochDay() - hireDate.toEpochDay());

        int coins = calculateCoins(hireDate, currentDate);
        System.out.println("The employee has worked " + daysWorked + " days and will receive " + coins + " gold coins.");

    }

    public static int calculateCoins(LocalDate hireDate, LocalDate currentDate) {

        int daysWorked = (int) (currentDate.toEpochDay() - hireDate.toEpochDay());

        int coins = 0;
        if (daysWorked >= 80 && daysWorked < 172) {
            coins = 5;
        } else if (daysWorked >= 172 && daysWorked < 266) {
            coins = 3;
        } else if (daysWorked >= 266) {
            coins = 1;
        }
        return coins;
    }
}
