package ustbatch3;

import maxvalue.MaxValueInArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxValueTest {

    @Test
    public void testCasesForFindingMaxElement() {

        int firstArray[] = {-1, -2, 0, 2, -9};
        int firstArrayMax = 2;

        int secondArray[] = {3, 4, 3, 0};
        int secondArrayMax = 4;

        assertEquals(firstArrayMax, MaxValueInArray.maxElement(firstArray));
        assertEquals(secondArrayMax, MaxValueInArray.maxElement(secondArray));
    }
}
