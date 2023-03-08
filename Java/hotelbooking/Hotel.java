package hotelbooking;

public class Hotel {
    String hotelId;
    String hotelName;
    String hotelLocation;
    double priceForADay;

    public double getPriceForADay() {
        return priceForADay;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public void setPriceForADay(double priceForADay) {
        this.priceForADay = priceForADay;
    }

    public Hotel(String hotelId, String hotelName, String hotelLocation, double priceForADay) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.priceForADay = priceForADay;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }
}