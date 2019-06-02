package InputOuput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferesStreamDemo {
    public static void main(String[] args) {
        try {
            byte [] data = new byte[1] ;
            
            File srcFile = new File(args[0]);
            File desFile = new File(args[1]);
            
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile)) ;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desFile)) ;
            System.out.println("複製檔案" + srcFile.length() + "位元組");
            
            while (bufferedInputStream.read(data) != -1) {                
                bufferedOutputStream.write(data);
            }
            bufferedOutputStream.flush();
            bufferedInputStream.close();
            bufferedOutputStream.close();
            
            System.out.println("複製完成");
        } catch (ArrayIndexOutOfBoundsException ex ) {
              System.out.println("using : java  UseFileStream src des");
              ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
