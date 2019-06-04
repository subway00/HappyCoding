public class ReturnCartTest {

    public static void main(String[] args) {
        Shirt a = new Shirt("紅襯衫", 1000, 's', 'r');
        Pants b = new Pants("藍褲子", 2000, 'm', 'b', 'M');
        UnderWear c = new UnderWear("sexy內衣", 3000, 's', 'R');
        ReturnCart s = new ReturnCart();
        
        s.add(a);
        s.add(b);
        s.displayInf();
    }
    
}
