package ustbatch3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOrOdd {

    // The Number is even
    @Test
    public void testEven() {
        int theNumber = 10;
        boolean theResult = isEven(theNumber);
        assertTrue(theResult);
    }

    // The Number is odd
    @Test
    public void testOdd() {
        int theNumber = 9;
        boolean theResult = isEven(theNumber);
        assertFalse(theResult);
    }

    public boolean isEven(int number){
        return number%2 == 0;
    }
}
