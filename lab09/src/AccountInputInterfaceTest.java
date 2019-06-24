public class AccountInputInterfaceTest {
    public static void main(String[] args) {
        AccountInputInterface a = new AccountInputInterface();
        String name = a.inputName();
        int balance = a.inputBalance();
        
        System.out.println("Name: " + name + "\nbalance :" + balance);
    }
}
