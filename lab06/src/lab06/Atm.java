package lab06;


public class Atm {
    public void transfer (Account acc1 , int amount, Account acc2) {
        System.out.println("--轉帳--");
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}
