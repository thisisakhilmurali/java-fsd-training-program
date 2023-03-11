package textileofkevin;

import java.time.LocalDate;

public class Garments {
    private String typeOfGarment;
    private int count;
    private double price;
    private LocalDate date;

    public Garments(String typeOfGarment, int count, double price, LocalDate date) {
        this.typeOfGarment = typeOfGarment;
        this.count = count;
        this.price = price;
        this.date = date;
    }
    public String getTypeOfGarment() {
        return typeOfGarment;
    }

    public void setTypeOfGarment(String typeOfGarment) {
        this.typeOfGarment = typeOfGarment;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public double getTotalSaleAmount() {
        return count * price;
    }
}
