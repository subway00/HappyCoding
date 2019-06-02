package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {

    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        Scanner console = null;
        try {
            console = new Scanner(new FileInputStream(name));//建構FileInputStream實例就會開啟檔案，不使用時，應close().
            while (console.hasNext()) {
                text.append(console.nextLine()).append('\n');
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw ex;
        } finally {  //有try catch時，需下在其後。
            if (console != null) {
                console.close();
            }
        }
        return text.toString();
    }
}
