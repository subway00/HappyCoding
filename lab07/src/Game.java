
import java.util.Random;
import java.util.ArrayList;

public class Game {

    private static final int siccor = 0;
    private static final int rock = 1;
    private static final int papper = 2;
    private static String[] array = {"剪刀", "石頭", "布"};
    private static final Random r = new Random();
    private ArrayList<String> arraylist = new ArrayList<>();
    private static int num1, num2, num3;

    public Game() {
        for (int i = 1; i <= 10; i++) {
            int n = r.nextInt(3);
            arraylist.add(array[n]);
        }
    }
    public void display() {
        System.out.println(arraylist);
    }
    public void find() {
        for (String arr : arraylist) {
            if (arr == "剪刀") {
                num1++;
            } else if (arr == "石頭") {
                num2++;
            } else if (arr == "布") {
                num3++;
            }
        }
        System.out.printf("剪刀次數 %d, 石頭次數 %d , 布次數 %d ", num1, num2, num3);
    }
    public void timesArray () {
        
    }
}