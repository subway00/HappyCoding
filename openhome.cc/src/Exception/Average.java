package Exception;

import java.io.IOException;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws IOException{
        Scanner console = new Scanner(System.in);
        double sum=0;
        int count=0;
        //try {
        int ch = System.in.read();  //read()會拋出IOException.
        while (true) {
            int number = console.nextInt();
            if (number == 0) {
                break;
            }
            sum += number; //variable 使用前須先設值給他
            count ++;
        }
        //}  catch (IOException ex) {       }
        System.out.printf("平均 %.2f%n", sum / count);
    }
}
