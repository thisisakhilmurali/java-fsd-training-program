package textileofkevin;

import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class GarmentSaleAnalyzerTest {
    @Test
    public void testGarmentSaleAnalyzer() {

        List<Garments> garments = new ArrayList<>();
        garments.add(new Garments("t-Shirt", 10, 500, LocalDate.of(2023, 3, 10)));
        garments.add(new Garments("Pants", 5, 200, LocalDate.of(2023, 3, 10)));
        garments.add(new Garments("Shirt", 5, 250, LocalDate.of(2023, 3, 9)));
        garments.add(new Garments("Shirt", 5, 500, LocalDate.of(2023, 3, 10)));

        GarmentSaleAnalyzer analyzer = new GarmentSaleAnalyzer(garments);

        Map<String, Double> result = analyzer.analyze(LocalDate.of(2023, 3, 10));

        assertEquals(2500, result.get("Shirt"), 0);
        assertEquals(1000, result.get("Pants"), 0);
    }
}