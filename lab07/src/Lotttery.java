import java.util.ArrayList;
import java.util.Random;
public class Lotttery {
    ArrayList a = new ArrayList();
    int num ;
    int count = 0;
    public Lotttery() {
        for (int i = 1 ; i <= 42 ; i++ ) {
        a.add(i) ; //a [] index:0~41 ; a[0] = 1 , a[1] =2 ...a[41] = 42 .
        }
    }
    public void draw() {
    Random ran = new Random();
    for (int j = 1 ; j <=3 ; j ++) {    //抽3組號碼
    System.out.printf("第%d組號碼:%n", j);
    for ( int i =1 ;i <= 6 ; i++) {     //抽1組6個號碼
    num = ran.nextInt(42-count);
    Object drawnumber = a.remove(num) ;  //     接收remove()需為Object.
    System.out.printf("抽取的數字為 %d%n", drawnumber);
    count ++ ;
        }
    }
    System.out.println("剩餘數字量為:"+( a.size() +1));    
    }
    public void display() {
        System.out.println(a);
    }
}

