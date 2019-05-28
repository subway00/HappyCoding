package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Average3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        
        while (true) {
            try {
                int number = console.nextInt();
                if ( number == 0) { //if下在這，sum&count值才不會變動.  
                    break;          //若把if拿掉25行會出現 unreachable exception.
                }                   //因為此時while迴圈永遠不會結束.
                sum += number;
                count ++;
            } catch (InputMismatchException ex) {
                System.out.printf("輸入非數字%s,請重新輸入%n", console.next());
            }
        }
        System.out.printf("平均 %.2f%n", sum / count);
    }
}
