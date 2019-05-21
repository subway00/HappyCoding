import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
static String name ;
    public static String readFile(String name) {
        StringBuilder text = new StringBuilder();
        try {
            Scanner console = new Scanner(new FileInputStream(name));
            while (console.hasNext()) {
                text.append(console.nextLine()).append('\n');
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return text.toString();
    }
    public static void main(String[] args) {
        readFile(name) ;
    }
}
