package exercise8;

public class Main {
    public static void main(String[] args) {
        Account my = new Account("George", 1122, 1000);
        my.setAnnualInterestRate(1.5);
        for (int i = 30; i <=50 ; i+=10) {
            my.deposit(i);
        }
        my.withdraw(5);
        my.withdraw(4);
        my.withdraw(2);
        System.out.println(my);
    }
}
