public class Product {
    
    private String id;
    private String name;
    private int price;
    
    public Product (String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "編號" + id + "\n名稱" + name + "\n價錢" + price;
    }
}
