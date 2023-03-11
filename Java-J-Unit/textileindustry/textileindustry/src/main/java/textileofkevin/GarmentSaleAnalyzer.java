package textileofkevin;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GarmentSaleAnalyzer {
    private final List<Garments> garments;
    public GarmentSaleAnalyzer(List<Garments> garments) {
        this.garments = garments;
    }

    public Map<String, Double> analyze(LocalDate selectedDate) {
        List<Garments> selectedGarments = garments.stream()
                .filter(g -> g.getDate().equals(selectedDate))
                .collect(Collectors.toList());

        Map<String, Double> garmentSales = new HashMap<>();

        for (Garments garment : selectedGarments) {
            double totalSaleAmount = garment.getTotalSaleAmount();
            if (garmentSales.containsKey(garment.getTypeOfGarment())) {
                totalSaleAmount += garmentSales.get(garment.getTypeOfGarment());
            }
            garmentSales.put(garment.getTypeOfGarment(), totalSaleAmount);
        }

        return garmentSales;
    }
}

//public class GarmentSaleAnalyzer {
//    public static void main( String[] args ) {
//
//    }
//}
