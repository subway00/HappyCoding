
import java.util.Random;
import javax.swing.JOptionPane;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int a=0 ,b = 0;
        String sc,sc2;
        Random r = new Random();
        
        do {            
            sc = JOptionPane.showInputDialog("輸入陣列有幾行 1~5");
            sc2 = JOptionPane.showInputDialog("請輸入陣列有幾列 1~5");
            try {
                a = Integer.parseInt(sc);
                b = Integer.parseInt(sc2);
            } catch (NumberFormatException e) {
                System.out.println("輸入的不是整數");
            }
        } while ( a>5 || b>5 || a<0 || b<0 || sc==null || sc2==null);
        
        int [][] array = new int [a][b];
        
        for (int i = 0 ; i < a ; i++) {
            for (int j = 0 ; j < b ; j++) {
                array[i][j] = r.nextInt(99) + 1;
            }
        }
        
        if (a==0 || b==0) {
            System.out.println("什麼都沒有");
        }
        
        for (int i=0 ; i<a ; i++) {
            for (int j=0 ; j<b; j++) {
                System.out.println("array[" + i + "][" + j + "]  =" + array[i][j]);
            }
        }
    }
    
}
