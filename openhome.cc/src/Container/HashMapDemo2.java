package Container;
import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Justin", "Justin的訊息");
        map.put("Mormor", "Mormor的訊息");
        map.put("Catepillar", "Catepillar的訊息");
        
        for (String value : map.values()) {
            System.out.println(value);
        }
        Collection collection = map.values();
        Iterator iterator = collection.iterator();
            
    }
}
