package maintanancechargecalculator;

public class SavingsAccount extends Account implements MaintananceCharge {
    public SavingsAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public float calculateMaintananceCharge(float noOfYears) {
        return (50 * noOfYears) + 50;
    }
}
