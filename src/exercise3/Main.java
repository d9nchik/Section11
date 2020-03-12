package exercise3;

public class Main {
    public static void main(String[] args) {
        Account regular = new Account(1, 1000);
        CheckingAccount checking = new CheckingAccount(2, 1000, 500);
        SavingsAccount saving = new SavingsAccount(3, 100);
        System.out.println(regular);
        System.out.println(checking);
        System.out.println(saving);
    }
}
