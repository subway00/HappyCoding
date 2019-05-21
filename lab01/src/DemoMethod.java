/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DemoMethod {

    public static int primitiveparma(int parma) {
        parma = 10;
        return parma ;
    }

    public static void referparma(int[] array) {
        array[1] = 0;
    }

    public static void main(String[] args) {
        int x = 55;
        int[] array = {1, 2, 3, 4, 5
        };
        primitiveparma(x);
        System.out.println(x );
        System.out.println(primitiveparma(x));
        for (int arr : array) {
            System.out.print(arr);
        }
        System.out.println("");

        referparma(array);
        for (int arr : array) {
            System.out.print(arr);
        }
        System.out.println("");
    }
}
