package InputOuput;

import java.io.File;

public class Filedemo {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]) ;
            if (file.isFile()) {
                System.out.println(args[0]+"檔案");
            }
        } catch (Exception e) {
        }
    }
}
