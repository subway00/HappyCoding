package lab06;

public class Account {
    private String id ;
    private int balance ;
    
    public Account(String id , int balance) {
        this.id = id ;
        this.balance = balance;
    }
    public void deposit(int money) {
        this.balance += money ;
        System.out.printf("%s 存款為 %d%n",id,balance);
    }
    public void withdraw(int money) {
        this.balance -= money ;
        System.out.printf("%s 存款為 %d%n",id,balance);
    }
    public String getId() {
        return id ;
    }
    public int getBalance() {
        return balance;
    }
}
