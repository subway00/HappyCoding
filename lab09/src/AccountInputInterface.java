
import javax.swing.JOptionPane;

public class AccountInputInterface {
    public String inputName() {
        String name;
        while (true) {            
            name = JOptionPane.showInputDialog("請輸入名字");
            if (name == null || name.length() < 2) {
                JOptionPane.showMessageDialog(null, "字串長度不得<2 :" + name);
            }
            else {
                break;
            }
        }
        return name;
    }
    public int inputBalance() {
        int balance = 0;
        while (true) {            
            String s = JOptionPane.showInputDialog("輸入帳戶餘額");
            try {
                balance = Integer.parseInt(s);
                break;
            }
            catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "數字格式有問題 :" + s);
            }
        }
        return balance;
    }
}
