package org.frequency;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class AppTest {
    @Test
    public void checkFrequency() {

        List<String> myLaptopList = Arrays.asList(
                "Lenovo", "Dell", "Lenovo", "HP"
        );

        Map<String , Long> testMap = new HashMap<>();
        testMap.put("Lenovo", 2L);
        testMap.put("Dell", 1L);
        testMap.put("HP", 1L);

        assertEquals(testMap, App.getFrequencyFromList(myLaptopList));

    }
}