package org.employeecoin;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class AppTest {

    String startDate = "01 01 2022";
    String joinDate = "07 02 2022";

    public static int countCoins(String startDate, String joinDate) {

        int coinCount = 0;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate d1 = LocalDate.from(LocalDate.parse(startDate, dtf).atStartOfDay());
        LocalDate d2 = LocalDate.from(LocalDate.parse(joinDate, dtf).atStartOfDay());
        long daysBetween = Duration.between(d1, d2).toDays();

        if (daysBetween >= 0 && daysBetween <= 80)
            coinCount = 5;
        else if (daysBetween >= 81 && daysBetween <= 172)
            coinCount = 3;
        else if (daysBetween >= 173 && daysBetween <= 266)
            coinCount = 1;

        return coinCount;
    }

    @Test
    public void testCoin() {

        String startDate = "01 01 2022";
        String joinDate = "07 02 2022";
        int haveCoins = 5;

        assertEquals(haveCoins, countCoins(startDate, joinDate));

    }
}