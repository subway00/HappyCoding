
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Guess2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] hands = {"剪刀", "石頭", "布"  };
        Random ran = new Random();
        int com = ran.nextInt(3);
        
        try {
        String users = JOptionPane.showInputDialog(null, 
                "請輸入  剪刀:(0)石頭:(1)布:(2)");
        int user = Integer.parseInt(users);
        JOptionPane.showMessageDialog(null, "您輸入的是 "+ hands[user]);
        
        if ( user > com || ( user == 0 && com == 2)) {
                //System.out.printf("你贏了,  電腦是:%s", hands[com]);
                JOptionPane.showMessageDialog(null, "你贏了,  電腦是: " 
                        + hands[com]);
        }
        else if (user == com) {
                //System.out.printf("平手  電腦是:", hands[com]);
                JOptionPane.showMessageDialog(null, "平手  電腦是: " + 
                        hands[com]);
        }
        else {
            //System.out.printf("你輸了,電腦是:%s", hands[com]);
            JOptionPane.showMessageDialog(null, "你輸了,  電腦是: " +
                    hands[com]);
        }
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException 
                | NumberFormatException  e) {
            System.out.println("failed");
        }
    }
   /*public void display() {
        String [] hands = {"剪刀", "石頭", "布"  };
        for (int i=0 ; i<3 ; i++) {
        System.out.printf("%s:(%d)", hands[i] ,i);
        }
    }
*/
}


