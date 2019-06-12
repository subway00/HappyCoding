
import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        List<String> list;
        Set<String> set;
        
        list = new ArrayList<>();
        set = new HashSet<>();
        helpYouPlace(list);
        helpYouPlace(set);
        
    }

    public static void helpYouPlace(Collection c) {
        if (c instanceof List) {
            System.out.println("List有順序性");
        }
        if (c instanceof Set) {
            System.out.println("Set無順序性,不重複");
        }
        c.add("Java");
        c.add("C++");
        c.add("Python");
        c.add("C#");
        c.add("Java");
        System.out.println("size" + c.size());
        System.out.println(c);
        System.out.println("");
        
    }
}
