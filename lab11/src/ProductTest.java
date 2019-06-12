
import java.util.*;
import javax.swing.JOptionPane;

public class ProductTest {

    public static void main(String[] args) {
        Product p1 = new Product("A01", "iPhone", 20_000);
        Product p2 = new Product("A02", "SAMSUNG", 18_000);
        Product p3 = new Product("A03", "ASUS", 12_000);
        String id = "";

        Map<String, Product> map = new HashMap<>();
        map.put("A01", p1);
        map.put("A02", p2);
        map.put("A03", p3);

        while (true) {
            id = JOptionPane.showInputDialog("請輸入id來查詢, 或輸入0結束程式");
            if (id.equals("0")) {
                break;
            }
            Product p = map.get(id);
            if (p == null) {
                JOptionPane.showMessageDialog(null, "查無此產品代號" + id);
            } else {
                JOptionPane.showMessageDialog(null, p);
            }
        }

    }

}
