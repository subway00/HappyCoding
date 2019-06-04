public class Shirt extends Clothes implements Returnable{
    public Shirt(String name, int price, char size, char color) {
        super(name, price, size, color);
    }
    @Override
    public  String returnInf() {        //implements interface remive abstract.
        return "襯衫3日內退";
    }
}
