package ustbatch3;

import count.CountVowels;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountVowelsTest {

    @Test
    public void countTesting() {
        String inputString = "akhil";
        int expectedOutput = 2;

        int actualOutput = CountVowels.vowelsCount(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}
