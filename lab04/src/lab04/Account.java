package lab04;

public class Account {
        Display view = new Display() ;

        String id;
        long balance;
        /*
        public void deposit(int money) {
            
                if (money > 0) {
                        balance += money;
                        view.displayDesignInf("存款成功");
                } else {
                        view.displayDesignInf("存款失敗");
                }
        }
        */
        public void deposit (int money) throws InsufficinetException {
            assert money >= 0 : "存款失敗" ;
            if (money > 0) {
                        balance += money;
                        view.displayDesignInf("存款成功");
            }
        }
        public void withdrawl(int money) {
                if (money > balance) {
                        view.displayDesignInf("提款失敗");
                }
                else {
                        balance -= money;
                        view.displayDesignInf("提款成功");
                }
        }

        public void transfer(int money) {
                if (money > balance) {
                        view.displayDesignInf("轉帳失敗");
                }
                else  {
                        balance -= money;
                        view.displayDesignInf("轉帳成功");
                }
        }

        public void receivetransfer(int money) {
                balance += money;
        }

}
