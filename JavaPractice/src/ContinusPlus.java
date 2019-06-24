public class ContinusPlus {

    public static void main(String[] args) {
        int sum=0;
        for (int i = 1 ; i <= 100 ; i ++) {
            sum += i;
            i += 3;     //印出3的倍數
            System.out.println(sum+"  ");
        }
        
    }
    
}
