package lab04;

import javax.swing.JOptionPane;

public class OperationInterface {

        String p, s2;
        Customer cus;
        Account acc;
        Display view;

        public void start() {
                initial();
                while (!p.equals("9")) {
                        menu();
                        selectmenu();
                }
        }

        private void menu() {
                String s = "1.建立客戶與帳戶\n" + "2.選擇操作帳戶\n" + "3.存款\n" + "4.提款\n" + "5.轉帳\n" + "6.顯示客戶帳務資訊\n" + "9.結束系統\n";
                do {
                        p = JOptionPane.showInputDialog(null, s);

                        if (p == null) {
                                view.displayDesignInf("請輸入9結束程式");
                        }
                } while (p == null);
        }

        private void selectmenu() {

                switch (p) {
                case "1":
                        setCustomer();
                        setAccount();
                        break;
                case "2":
                        if (cus == null) {                                                              // 防錯: 未建立客戶資料而操作。
                                view.displayDesignInf("請輸入1建立客戶資料");
                                break;
                        } else {
                                selectAccount();
                                break;
                        }

                case "3":
                        if (cus == null) {
                                view.displayDesignInf("請輸入1建立客戶資料");
                                break;
                        } else {
                                if ( s2 == null ) {                                                       // 防錯 : 未選擇帳戶而操作 。
                                        view.displayDesignInf("請先選擇帳戶再進行操作");
                                        break ;
                                }
                                else {
                                setdeposit();
                                break;
                                }
                        }
                case "4":
                        if (cus == null) {
                                view.displayDesignInf("請輸入1建立客戶資料");
                                break;
                        } else {
                                if ( s2 == null ) {
                                        view.displayDesignInf("請先選擇帳戶再進行操作");
                                        break ;
                                }
                                else {
                                setwithdrawl();
                                break;
                                }
                        }
                case "5":
                        if (cus == null) {
                                view.displayDesignInf("請輸入1建立客戶資料");
                                break;
                        } else {
                                if ( s2 == null ) {
                                        view.displayDesignInf("請先選擇帳戶再進行操作");
                                        break ;
                                }
                                else {
                                transfer();
                                break;
                                }
                        }
                case "6":
                        if (cus == null) {
                                view.displayDesignInf("請輸入1建立客戶資料");
                                break;
                        } else {
                                if ( s2 == null ) {
                                        view.displayDesignInf("請先選擇帳戶再進行操作");
                                        break ;
                                }
                                else {
                                view.displayAccoount(cus);
                                break;
                                }
                        }
                case "9":
                        break;
                default:
                        view.displayDesignInf("尚未支援");

                }
        }

        private void setCustomer() {
                if (cus == null) {
                        cus = new Customer();
                        cus.id = 123456789;
                        cus.name = "神秘客";
                        view.displayDesignInf("建立客戶" + cus.id + "" + cus.name);
                } else {
                        view.displayDesignInf("客戶資料已建立");
                }

        }

        private void setAccount() {
                if (cus.acc1 == null) {
                        cus.acc1 = new Account();

                        cus.acc1.id = "ACC01";
                        cus.acc1.balance = 1000;
                        view.displayDesignInf("建立帳戶" + cus.acc1.id + "" + cus.acc1.balance);
                }
                if (cus.acc2 == null) {
                        cus.acc2 = new Account();
                        cus.acc2.id = "ACC02";
                        cus.acc2.balance = 2000;
                        view.displayDesignInf("建立帳戶" + cus.acc2.id + "" + cus.acc2.balance);
                }
        }

        private String selectAccount() {
                if (cus == null) {
                        view.displayDesignInf("建立帳戶");

                }
                String s = "選擇操作帳戶\n" + "1.Account1\n" + "2.Account2\n";
                s2 = JOptionPane.showInputDialog(null, s);
                if (s2.equals("1")) {
                        acc = cus.acc1;
                        view.displayDesignInf("操作帳戶1");
                } else if (s2.equals("2")) {
                        acc = cus.acc2;
                        view.displayDesignInf("操作帳戶2");
                } else {
                        view.displayDesignInf("操作失敗");
                }
                return s2;

        }

        private void setdeposit() {
                String money = JOptionPane.showInputDialog(null, "請輸入存款金額");
                int m1 = Integer.parseInt(money);
                if (s2.equals("1")) {
                        cus.acc1.deposit(m1);
                }
                if (s2.equals("2")) {
                        cus.acc2.deposit(m1);
                }
        }

        private void setwithdrawl() {
                String money = JOptionPane.showInputDialog(null, "請輸入提款金額");
                int m2 = Integer.parseInt(money);
                if (s2.equals("1")) {
                        cus.acc1.withdrawl(m2);
                }
                if (s2.equals("2")) {
                        cus.acc2.withdrawl(m2);
                }
        }

        private void transfer() {
                String money = JOptionPane.showInputDialog(null, "請輸入轉帳金額");
                int m2 = Integer.parseInt(money);
                if (s2.equals("1")) {
                        if (cus.acc1.balance > 0) {
                                cus.acc1.transfer(m2);
                                cus.acc2.receivetransfer(m2);
                        } else
                                view.displayDesignInf("金額不足");
                }
                if (s2.equals("2")) {
                        if (cus.acc2.balance > 0) {
                                cus.acc2.transfer(m2);
                                cus.acc1.receivetransfer(m2);
                        } else
                                view.displayDesignInf("金額不足");
                }
        }

        /*
         * private void displayaccount() { if (cus == null) {
         * view.displayDesignInf("未建立客戶"); } String s = "帳戶資訊\n" + cus.id + "\n" +
         * cus.name + "\n-------\n" + cus.acc1.id + "\n" + "餘額為\n" + cus.acc1.balance +
         * "\n" + cus.acc2.id + "\n" + "餘額為\n" + cus.acc2.balance;
         * view.displayDesignInf( s); }
         */
        private void initial() {
                view = new Display();
                view.setAccount(cus);
                p = "";
        }

}
