
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;

public class GuessNumber {

    public static void main(String[] args) {
        Random ran = new Random();
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String com;
        int countA = 0;
        int countB = 0;
        
        
        while (true) {
            set.add(ran.nextInt(10));
            if (set.size() == 4) {
                break;
            }
        }
        for (int s : set) {
            String str = Integer.toString(s);
            sb.append(str);
        }
        com = sb.toString();
        System.out.println(sb.toString());
        String input = JOptionPane.showInputDialog(null, "請輸入4位數字");
        if (input.equals(com)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        //number of A
        char [] youNum = input.toCharArray();
        char [] comNum = com.toCharArray();
        for ( int i=0 ; i<=3 ; i++) {
            if (youNum[i] == comNum[i]) {
                countA++;
            }
        }
        System.out.println(countA + "A");
        
        //number of B
        for ( int i =0 ; i<=3 ; i++) {
            char c1 = youNum[i];
            for ( int j=0 ; j<=3 ; j++) {
                char c2 = comNum[j];
                if (c1==c2) {
                    countB++;
                }
            }
        }
        System.out.println((countB-countA) + "B");
        JOptionPane.showMessageDialog(null, countA + "A" + (countB-countA) + "B");
    }

}
