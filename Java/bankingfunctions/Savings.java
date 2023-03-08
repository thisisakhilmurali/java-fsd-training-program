package bankingfunctions;

public class Savings extends Account{
    private double minimumBalance;

    public Savings(int accountNumber, Customer cust, double balance, double minimumBalance) {
        super(accountNumber, cust, balance);
        this.minimumBalance = minimumBalance;
    }

    public boolean withdraw(double amount){
        if(balance - amount > minimumBalance) {
            balance -= amount;
            return true;
        }
        else
            return false;
    }
}
