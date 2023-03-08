package productpricefilter;

public class Product {
    int productId;
    double productPrice;
    String productName;

    Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
