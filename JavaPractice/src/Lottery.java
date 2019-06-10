
import java.util.ArrayList;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {
        ArrayList arrs = new ArrayList();
        Random ran = new Random();
        int count = 0;
        Object drawNumber;

        for (int i = 1; i <= 42; i++) {
            arrs.add(i);
        }
        for (int i = 1; i <= 7; i++) {
            //int num = ran.nextInt(42 - count);
            int num = ran.nextInt(arrs.size());
            drawNumber = arrs.remove(num);
            if (i <= 6) {
                System.out.printf("第 %d 數字為:%d%n", i, drawNumber);
                count++;
            } else {
                System.out.printf("特別號為: %d%n", drawNumber);
            }
        }
    }
}
