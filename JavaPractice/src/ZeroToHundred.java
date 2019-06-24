public class ZeroToHundred {

    public static void main(String[] args) {
        int sum = 0;
        for (int i=1 ; i<=100 ; i++) {
            sum += i;
            if ( sum %3 == 0) {
                System.out.println(sum);
            }
        }
        
    }
    
}
