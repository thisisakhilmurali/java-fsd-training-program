package hotelbooking;

public class Customer {
    String idProof;
    String nameOfCustomer;
    String emailOfCustomer;
    String locationOfCustomer;

    public Customer(String idProof, String nameOfCustomer, String emailOfCustomer, String locationOfCustomer) {
        this.idProof = idProof;
        this.nameOfCustomer = nameOfCustomer;
        this.emailOfCustomer = emailOfCustomer;
        this.locationOfCustomer = locationOfCustomer;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getEmailOfCustomer() {
        return emailOfCustomer;
    }

    public void setEmailOfCustomer(String emailOfCustomer) {
        this.emailOfCustomer = emailOfCustomer;
    }

    public String getLocationOfCustomer() {
        return locationOfCustomer;
    }

    public void setLocationOfCustomer(String locationOfCustomer) {
        this.locationOfCustomer = locationOfCustomer;
    }
}
