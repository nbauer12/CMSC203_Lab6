package lab6;

public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15;

    public CheckingAccount(String name, double amount) {
        super(name, amount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.getBalance() >= amount + FEE) {
            return super.withdraw(amount + FEE);
        } else {
            System.out.println("Insufficient balance for withdrawal");
            return false;
        }
    }
}


