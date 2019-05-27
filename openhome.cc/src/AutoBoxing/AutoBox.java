/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoBoxing;

/**
 *
 * @author pig94
 */
public class AutoBox {
    public static void main(String args[]) {
    Integer i1 = 200 ;
    Integer i2 = 200 ;
    
    if (i1 == i2 ) { 
        System.out.println("i1 == i2"); 
    }
    else {
        System.out.println("i1 != i2"); //印出此行，i1 i2參考至不同物件。
    }
    }
    
}
