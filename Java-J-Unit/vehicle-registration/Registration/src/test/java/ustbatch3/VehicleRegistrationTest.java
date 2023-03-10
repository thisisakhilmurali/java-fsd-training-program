package ustbatch3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class VehicleRegistrationTest {
    @Test
    public void testingAreaKL() {
        String testRegistrationNumber = "KL02T7234";
        List<String> myList = Arrays.asList("Kerala", "Kollam");
        assertEquals(myList, App.findStateAndDistrict(testRegistrationNumber));
    }

    @Test
    public void testingAreaTN() {
        String testRegistrationNumber = "TN02T7234";
        List<String> myList = Arrays.asList("Tamil Nadu", "Coimbatore-North");
        assertEquals(myList, App.findStateAndDistrict(testRegistrationNumber));
    }

    @Test
    public void testingAreaKA() {
        String testRegistrationNumber = "KA01T7234";
        List<String> myList = Arrays.asList("Karnataka", "Koramangala");
        assertEquals(myList, App.findStateAndDistrict(testRegistrationNumber));
    }
}
