package customerretrieval;

public class CustomersAreKings {
    String registerId;
    String customerName;
    String contactNumber;
    String contactMail;
    String location;

    public CustomersAreKings(String registerId, String customerName, String contactNumber, String contactMail, String location) {
        this.registerId = registerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.contactMail = contactMail;
        this.location = location;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
