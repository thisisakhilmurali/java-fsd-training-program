package fooddetails;

// Class for Restaurant (LeArabia)
public class LeArabia {
    private String foodId;
    private String foodName;
    private double priceOfFood;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public LeArabia(String foodId, String foodName, double priceOfFood) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.priceOfFood = priceOfFood;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPriceOfFood() {
        return priceOfFood;
    }

    public void setPriceOfFood(double priceOfFood) {
        this.priceOfFood = priceOfFood;
    }
}
