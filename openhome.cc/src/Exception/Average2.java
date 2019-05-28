/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.*;
public class Average2 {
    public static void main(String args []) {
        try {
            Scanner console = new Scanner(System.in) ;
            double sum = 0 ;
            int count = 0;
            while (true) {                
                int number = console.nextInt();//nextInt()將輸入的字串剖析為int
                if (number == 0) {
                    break;
                }
                sum += number;
                count ++;
            }
            System.out.printf("平均 %.2f%n", sum / count);
        }   catch (InputMismatchException ex) {
            System.out.println("必須輸入整數");
        }
        
    }
    
}
