import java.util.Random;
import java.util.ArrayList;

public class Game {
    private static final int siccor = 0 ;
    private static final int rock = 1 ;
    private static final int papper = 2 ;
    private static String [] array = { "剪刀" , "石頭" , "布" };
    private static final Random r = new Random();
    private static int count = 0 ;
    private ArrayList<String> arraylist = new ArrayList<>(); 
    private static int num ;
    
    public void choose() {
        for (int i = 1 ; i <= 10 ; i ++) {
        int n = r.nextInt(3);
        System.out.println(array[n]);
        arraylist.add(array[n]);
        count ++ ;
                }        
    }
   public int countTimes() {
       return count;
   }
   public void display() {
       System.out.println(arraylist);
   }
   public void find() {
      for ( int j=1 ; j<=arraylist.size() ; j ++) {
      
      num = arraylist.indexOf("石頭");
      arraylist.remove(num);
      System.out.print(num);
      }        
      
       
   }
}
