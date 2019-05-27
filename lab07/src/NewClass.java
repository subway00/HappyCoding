import java.util.ArrayList;
import java.util.Random;
public class NewClass {
    static ArrayList arr = new ArrayList();
    static Random ran = new Random();
    public static void main(String[] args) {
        /*arr.add("lemon");
        arr.add("orange");
        arr.add("apple");
        arr.size();
        */
        for (int i=1 ; i <= 10 ; i++) {
        int w = ran.nextInt(10);
        arr.add(w);
        }
        System.out.println(arr.size());
    }
}
