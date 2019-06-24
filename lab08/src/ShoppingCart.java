
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Returnable> a;
    private int total;
    
    public ShoppingCart() {
        a = new ArrayList<Returnable>();
        total = 0;
    }
    public void add(Returnable x) {        //polymorphism
        //total += x.getPrice();
        a.add(x);
    }
    public void displayInf() {
        for (Returnable x : a) {           //polymorphism
            ((Clothes)x).displayInf();      //原x Returnable, 讓x cast Clothes
            System.out.println(x.returnInf());
        }
        
    }
    
}
