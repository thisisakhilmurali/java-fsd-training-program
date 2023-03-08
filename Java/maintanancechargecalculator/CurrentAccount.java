package maintanancechargecalculator;

public class CurrentAccount extends Account implements MaintananceCharge{
    public CurrentAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public float calculateMaintananceCharge(float noOfYears) {
        return (100 * noOfYears) + 200;
    }
}
