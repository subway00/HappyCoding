/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Container;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> list = new ArrayList<String>();
        System.out.println("輸入名稱(使用quit結束)");
        
        while (true) {
            System.out.println("#");
            String input  = scanner.next();
            if (input.equals("quit")) {
                break;
            }
            list.add(input);
        }
        System.out.println("顯示輸入: ");
        for (int i=0 ; i<list.size() ; i++) {
            System.out.println(list.get(i) + "");
        }
        System.out.println("");
    }
    
}
