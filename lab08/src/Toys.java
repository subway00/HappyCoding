public class Toys implements Returnable{
    private String name;
    private int price;
    @Override
    public  String returnInf() {
        return "玩具1日內可退";
    }
    public Toys(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void displayInf() {
        System.out.println("名稱\t\n" + name + "價格\t\n" + price);
    }
    
}
