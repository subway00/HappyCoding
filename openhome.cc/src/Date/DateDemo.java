/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        System.out.println(date); 
        System.out.println("現在時間" + date.toString());
        
        String fmt = "yyyy/MM/dd";
        //SimpleDateFormat sdf = new SimpleDateFormat;
    }
    
}
