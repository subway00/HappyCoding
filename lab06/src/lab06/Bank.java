package lab06;

public class Bank {
    private Account[] accounts ;
    
    public Bank() {
        /*
       accounts = new Account[2];
       accounts[0] = new Account("A01", 100) ;
       accounts[1] = new Account("A02", 200) ;
       */
    Account[ ] accounts = { new Account("A01", 100) , new Account("A02", 200) };   
    
}
    public Account getAccount(String id ) {
        for (Account ac : accounts) {
            
            if (ac.getId().equals(id)) {
                
                return ac;
            }
        }
        return null ;
        
    }
    public void display () {
        System.out.println("--銀行帳戶資訊--");
        for (Account ac2 : accounts) {
           
            System.out.printf("%s 存款為 %d%n",ac2.getId(),ac2.getBalance());
        }
    }
}
