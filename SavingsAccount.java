package lab6;

public class SavingsAccount extends BankAccount {
    private static final double ANNUAL_INTEREST_RATE = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        savingsNumber = oldAccount.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

    public void postInterest() {
        double monthlyInterest = super.getBalance() * (ANNUAL_INTEREST_RATE / 12);
        super.deposit(monthlyInterest);
    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }
}



