package InputOuput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class app14_1 {

    public static void main(String[] args) throws IOException{
        String str;
        int count = 0;
        BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\test.txt"));
        
        while ((str = bfr.readLine()) != null) {    //每次讀一行，讀完則傳回null
            count ++;
            System.out.println(str);
        }
        System.out.println(count + " lines read");
        bfr.close();
    }
    
}
