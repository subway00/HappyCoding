package lab06;

import java.util.Arrays ;

public class Lab06 {
static int total = 0 ;
    public static void main(String[] args) {
        
        int [] b = { 3 , 4 , 5 , 6 } ;
        int [] c2 = Arrays.copyOf(b, b.length) ;
        for ( int b1 : b) {
            System.out.printf("%d ", b1);
            total += b1 ;
        }
        System.out.println("");
        for (int c1 : c2) {
            System.out.printf("%d ", c1);
        }
        System.out.println();
        System.out.println(total);
        for ( int i = 0 ; i < b.length ; i++) System.out.print( b[i] );
        
        int [][] c = {
            { 1 , 1 , 1 } , { 2 , 2 , 2 } 
        } ;
        for ( int[] c1 : c) {
            for ( int value : c1)
                System.out.printf("%d ", value);
        }
    
    }
}
