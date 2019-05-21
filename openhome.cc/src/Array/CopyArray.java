/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author pig94
 */
public class CopyArray {

    public static void main(String args[]) {
        int[] scores1 = {2, 3, 5};
        int[] scores2 = new int[scores1.length];

        for (int i=0 ; i<scores1.length ; i++) {
            //for 需在main method裡。
            scores2[i] = scores1[i];
        }
        for (int i : scores2) System.out.print(i);
        
    }
}

