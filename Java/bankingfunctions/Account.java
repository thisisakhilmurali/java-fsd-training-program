package bankingfunctions;

abstract public class Account {
    protected int accountNumber;
    protected Customer cust;
    protected double balance;

    public Account(int accountNumber, Customer cust, double balance) {
        this.accountNumber = accountNumber;
        this.cust = cust;
        this.balance = balance;
    }

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
