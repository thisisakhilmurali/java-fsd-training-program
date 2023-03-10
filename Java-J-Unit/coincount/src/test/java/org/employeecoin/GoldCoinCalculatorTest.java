package org.employeecoin;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldCoinCalculatorTest {
        @Test
        public void testEmployeeWorks80Days() {
            LocalDate hireDate = LocalDate.of(2023, 1, 1);
            LocalDate currentDate = LocalDate.of(2023, 3, 22);
            int expectedCoins = 5;
            int actualCoins = GoldCoinCalculator.calculateCoins(hireDate, currentDate);
            assertEquals(expectedCoins, actualCoins);
        }
        @Test
        public void testEmployeeWorks172Days() {
            LocalDate hireDate = LocalDate.of(2023, 1, 1);
            LocalDate currentDate = LocalDate.of(2023, 6, 22);
            int expectedCoins = 3;
            int actualCoins = GoldCoinCalculator.calculateCoins(hireDate, currentDate);
            assertEquals(expectedCoins, actualCoins);
        }
        @Test
        public void testEmployeeWorks266Days() {
            LocalDate hireDate = LocalDate.of(2023, 1, 1);
            LocalDate currentDate = LocalDate.of(2023, 9, 25);
            int expectedCoins = 1;
            int actualCoins = GoldCoinCalculator.calculateCoins(hireDate, currentDate);
            assertEquals(expectedCoins, actualCoins);
        }

        @Test
        public void testEmployeeWorksLessThan80Days() {
            LocalDate hireDate = LocalDate.of(2023, 1, 1);
            LocalDate currentDate = LocalDate.of(2023, 3, 1);
            int expectedCoins = 0;
            int actualCoins = GoldCoinCalculator.calculateCoins(hireDate, currentDate);
            assertEquals(expectedCoins, actualCoins);
        }
        @Test
        public void testEmployeeWorksBetween80And172Days() {
            LocalDate hireDate = LocalDate.of(2023, 1, 1);
            LocalDate currentDate = LocalDate.of(2023, 4, 1);
            int expectedCoins = 5;
            int actualCoins = GoldCoinCalculator.calculateCoins(hireDate, currentDate);
            assertEquals(expectedCoins, actualCoins);
        }
        @Test
        public void testEmployeeWorksBetween172And266Days() {
            LocalDate hireDate = LocalDate.of(2023, 1, 1);
            LocalDate currentDate = LocalDate.of(2023, 7, 1);
            int expectedCoins = 3;
            int actualCoins = GoldCoinCalculator.calculateCoins(hireDate, currentDate);
            assertEquals(expectedCoins, actualCoins);
        }
        @Test
        public void testEmployeeWorksMoreThan266Days() {
            LocalDate hireDate = LocalDate.of(2023, 1, 1);
            LocalDate currentDate = LocalDate.of(2024, 1, 1);
            int expectedCoins = 1;
            int actualCoins = GoldCoinCalculator.calculateCoins(hireDate, currentDate);
            assertEquals(expectedCoins, actualCoins);
        }
    }
