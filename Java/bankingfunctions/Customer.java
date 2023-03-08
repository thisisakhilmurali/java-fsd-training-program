package bankingfunctions;

public class Customer {
    private int customerId;
    private String customerName;
    private String emailId;

    public Customer(int customerId, String customerName, String emailId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.emailId = emailId;
    }

    public String getCustomerName() {
        return customerName;
    }
}
