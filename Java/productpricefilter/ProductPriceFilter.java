package productpricefilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductPriceFilter {
    public static void main(String[] ar) {

        Product macbook16 = new Product(2001, "MacBook Pro 16", 250000.00);
        Product appleSiliconCase = new Product(2003, "Apple Silicon Case (Purple)", 4000.00);
        Product magsafeCharger = new Product(2004, "Mag Safe Wireless Charger", 4500.00);
        Product watch4 = new Product(2005, "Watch Series 4", 42000.00);
        Product airPod = new Product(2006, "Airpod Gen 2", 18000.00);

        List<Product> shoppingCart = new ArrayList<>();
        shoppingCart.add(macbook16);
        shoppingCart.add(appleSiliconCase);
        shoppingCart.add(magsafeCharger);
        shoppingCart.add(watch4);
        shoppingCart.add(airPod);

        List<Double> productPriceAbove10K = shoppingCart.stream()
                .filter(val -> val.productPrice > 10000)
                .map(val -> val.productPrice)
                .collect(Collectors.toList());


        System.out.println(productPriceAbove10K);

        shoppingCart.stream().filter(val -> val.productPrice>10000).forEach(val -> System.out.println(val.productName + val.productPrice));
    }
}
