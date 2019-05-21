
package lab04;

import javax.swing.JOptionPane;

public class Display {
        Customer cus ;
        
        public void displayDesignInf(String s) {
                JOptionPane.showMessageDialog(null , s) ;
        }
        public void setAccount( Customer cus) {
                if ( cus == null ) displayDesignInf("未建立客戶");
                this.cus = cus ;
        }
        public void displayAccoount(Customer cus) {
                String s = "帳戶資訊\n" + cus.id + "\n" + cus.name + "\n-------\n" + cus.acc1.id + "\n" + "餘額為\n"
                                + cus.acc1.balance + "\n" + cus.acc2.id + "\n" + "餘額為\n" + cus.acc2.balance;
                displayDesignInf( s);
        
        }
}
