package exercise3;

public class CheckingAccount extends Account {
    private int overdraftLimit = 100;
    @Override
    public void withdraw(int sum){
        if (sum-super.getBalance()<=overdraftLimit)
            super.withdraw(sum);
    }

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public CheckingAccount(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(int id, double balance, int overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
