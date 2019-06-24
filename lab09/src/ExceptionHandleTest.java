
import javax.swing.JOptionPane;

public class ExceptionHandleTest {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("請輸入名字");
        if (name.length() < 2) {
            System.out.println("name.length<2");
        }
}
}
