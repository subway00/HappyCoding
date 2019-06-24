public class ShoppingCartTest {
    public static void main(String[] args) {
    
        Shirt a = new Shirt("紅襯衫", 1000, 's', 'r');
        Pants b = new Pants("藍褲子", 2000, 'm', 'b', 'M');
        
        ShoppingCart s = new ShoppingCart();
        s.add(a);
        s.add(b);
        s.displayInf();
}
}
