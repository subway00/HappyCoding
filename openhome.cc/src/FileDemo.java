
import java.io.File;
import java.util.ArrayList;

public class FileDemo {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            if (file.isFile()) {
                        System.out.println(args[0]+ "檔案");
                        System.out.print(file.canRead() ? "可讀" : "不可讀");
                        System.out.print(file.canWrite() ? "可寫" : "不可寫");
                        System.out.println(file.length()+ "位元組");
            }
            else {
                File [] files = file.listFiles();
                ArrayList<File> fileList = new ArrayList<File>() ;
                for (int i = 0 ; i < files.length ; i++ ) {
                    if (files[i].isDirectory()) {
                        System.out.println("[" + files[i].getPath() + "]");
                    }
                    else {
                        fileList.add(files[i]) ;
                    }
                }
                for (File f : fileList) {
                    System.out.println(f.toString());
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("using : java FileDemo pathname");
        }
}
}
