
import java.util.Scanner;

public class ConditonalOperator {

    public static void main(String[] args) {

        System.out.println("你的電信專案價格為多少?: ");
        Scanner staIn = new Scanner(System.in);
        int price = staIn.nextInt();

        System.out.println(price == 499 ? "輸入正確 " + price : "輸入不正確 " + price);
    }
}
