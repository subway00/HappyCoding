public class Pants extends Clothes implements Returnable{
    private char gender;
    public Pants(String name, int price, char size, char color, char gender) {
        super(name, price, size, color);
        this.gender = gender;
           }
    @Override
    public void displayInf() {
        super.displayInf();
        System.out.println(" gener:\t" + gender);
    }
    @Override
    public  String returnInf() {        //implements interface remove abstract.
        return "褲子7日內退";
    }
}
