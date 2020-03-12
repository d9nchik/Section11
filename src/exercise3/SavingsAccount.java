package exercise3;

public class SavingsAccount extends Account {
    @Override
    public void withdraw(int sum) {
        if (super.getBalance() - sum >= 0)
            super.withdraw(sum);
    }

    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }
}
