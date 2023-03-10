package ustbatch3;

import countofwordinalist.CountOfAWord;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CountOfAWordTestClass {
    @Test
    public void countWordInList() {

        String firstString = "Ubuntu";
        List<String> myFirstList = Arrays.asList("Ubuntu", "Debian", "Debian", "Cent", "Ubuntu");
        int countFirst = 2;

        String secondString = "Ubuntu";
        List<String> mySecondList = Arrays.asList("Ubuntu", "Debian", "Ubuntu", "Cent", "Ubuntu");
        int countSecond = 3;

        String thirdString = "Ubuntu";
        List<String> myThirdList = Arrays.asList("Cent", "Debian", "Cent", "Cent", "Debian", "Debian");
        int countThird = 0;


        assertEquals(countFirst, CountOfAWord.countTheValue(myFirstList, firstString));
        assertEquals(countSecond, CountOfAWord.countTheValue(mySecondList, secondString));
        assertEquals(countThird, CountOfAWord.countTheValue(myThirdList, thirdString));

    }
}
