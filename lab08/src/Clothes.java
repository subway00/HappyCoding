public abstract  class Clothes {
    private int id;
    private static int amount;
    
    private String name;
    private int price;
    private char size;
    private char color;
    
    public Clothes(String name, int price, char size, char color) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.caculateID();
    }
    private void caculateID() {
        amount += 1;
        id = amount;
    }
    public void displayInf() {
        System.out.println("id\t" + id + "\n name\t " + name + "\n price\t" + price +"\n sizr\t " + size + "\n color\t " + color);
    }
    
    //getter
    public int getId()  {                                                          
    return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public char getSize() {
        return size;
    }
    public char getColor() {
        return color;
    }
}
