package Exception;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException{
        //try {
        FileUtil file = new FileUtil();
        String test = file.readFile("c://workplace/test.txt");
            System.out.println(test);
            
        } 
       // catch (FileNotFoundException ex) {
            
        //}
        //}
}
