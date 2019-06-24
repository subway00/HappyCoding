import java.lang.Math;
import java.util.*;
import javax.swing.JOptionPane;

public class Guess {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] hands = {"剪刀", "石頭", "布"};
        Random ran = new Random();
        int com = ran.nextInt(3);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%s:(%d)", hands[i], i);
            }

            int user = console.nextInt();
            System.out.printf("你輸入: %s  ", hands[user]);

            if (user > com || (user == 0 && com == 2)) {
                System.out.printf("你贏了,  電腦是:%s%n", hands[com]);
            } else if (user == com) {
                System.out.printf("平手  電腦是:%s%n", hands[com]);
            } else {
                System.out.printf("你輸了,  電腦是:%s%n", hands[com]);
            }
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("failed");
        }
    }
}
