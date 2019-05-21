import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil2 {
    public static String readFile (String name) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        try (Scanner console = new Scanner (new FileInputStream(name)) ) {
            while (console.hasNext()) {
                text.append(console.nextLine()).append('\n') ;
            }
        }
        return text.toString();
    }
    public static void main(String[] args) {
        int [] a= { 1 , 2 , 4   } ;
        
    }
}
