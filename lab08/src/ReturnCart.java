
import java.util.ArrayList;

public class ReturnCart {
    private ArrayList<Returnable> a;
    private int total;
    
    public ReturnCart() {
        a = new ArrayList<Returnable>();
        total = 0;
    }
    public void add(Returnable x) {        //polymorphism
        //total += x.getPrice();
        a.add(x);
    }
    public void displayInf() {
        for (Returnable x : a) {           //polymorphism
            if (x instanceof Clothes) {         //instanceof判斷物件形態 , x物件是否為Clothes type.
                ((Clothes)x).displayInf();
            }
            else if (x instanceof Pants) {
            (Pants)x.displayInf();        
        }
            //((Clothes)x).displayInf();      //原x 'Returnable' type,把x cast 'Clothes' type
            System.out.println(x.returnInf());
        }
        
    }
}
