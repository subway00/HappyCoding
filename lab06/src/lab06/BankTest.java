package lab06;




public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank() ;
        Atm atm = new Atm() ;
        bank.display();
        
        Account ac1 = bank.getAccount("A01");
        Account ac2 = bank.getAccount("A02");
        
        if (ac1 != null && ac2 != null) {
            atm.transfer(ac1, 100 , ac2);
            
        }
    }
   
}
