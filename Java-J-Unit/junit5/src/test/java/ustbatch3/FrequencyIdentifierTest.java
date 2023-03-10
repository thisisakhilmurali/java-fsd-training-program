package ustbatch3;

import frequency.FrequencyIdentifier;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class FrequencyIdentifierTest {

    @Test
    public void checkFrequency() {

        List<String> myLaptopList = Arrays.asList(
                "Lenovo", "Dell", "Lenovo", "HP"
        );

        Map<String , Long> testMap = new HashMap<>();
        testMap.put("Lenovo", 2L);
        testMap.put("Dell", 1L);
        testMap.put("HP", 1L);

        assertEquals(testMap, FrequencyIdentifier.getFrequencyFromList(myLaptopList));

    }
}

