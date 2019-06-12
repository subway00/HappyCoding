import java.util.HashMap;
import java.util.Map;
public class MapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("Steve", "Apple");
        m.put("Bill", "Microsoft");
        System.out.println(m);
        System.out.println(m.get("Bill"));
        
        m.put("Bill", "Xbox");
        System.out.println(m);
        System.out.println(m.get("Bill"));
    }
    
}
