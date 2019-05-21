package encapsulation;

public class CardApp {

    public static void main(String[] args) {
        
        CashCard[] app = {
            new CashCard("VV", 10, 20),
            new CashCard("QQ", 100, 10)
        };
        for (CashCard card : app) {
            System.out.printf("(%s , %d , %d) %n", card.number, card.balance, card.bonus);
        }

    }
}
