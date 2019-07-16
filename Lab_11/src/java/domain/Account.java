package domain;

public class Account {
    private long balance = 5000;

    public long getBalance() {
        return balance;
    }
    public void deposit(long amount) {
        long balance = this.balance;
        try { Thread.sleep(5000);}
        catch (Exception e){
            e.printStackTrace();
        }
        balance += amount;
        this.balance = balance;
    }
    public void withdraw(long amount) {
        long balance = this.balance;
        
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
            e.printStackTrace();
        }
        balance -= amount;
        this.balance = balance;
    }
}
