package synchronization;

/**
 * @author liyi
 * @create 2021 -07 -16 -14:09
 */
public class SyncTest {  // 线程：同步锁练习 【银行账号】
    public static void main(String[] args) {
        // 创建线程
        AccountThread at = new AccountThread();
        Thread thread1 = new Thread(at, "用户A");
        thread1.start();
        Thread thread2 = new Thread(at, "用户B");
        thread2.start();
        Thread thread3 = new Thread(at, "用户C");
        thread3.start();
        Thread thread4 = new Thread(at, "用户D");
        thread4.start();

    }

    /**
     * 线程类
     */
    static class AccountThread implements Runnable {
        // 账户对象
        Account account = new Account();

        public void run() {
            synchronized (this) {
                if (account.balance > 300) {
                    // 如果账户余额大于300，取300元
                    account.drawMoney(300);
                    System.out.println(Thread.currentThread().getName() + "来取钱，取走了300元，还剩 " + account.balance);
                } else {
                    // 余额不足300，无法提款
                    account.checkMoney();
                    System.out.println(Thread.currentThread().getName() + "来取钱，余额不足，未提现成功，还剩 " + account.balance);
                }
            }
        }
    }


    /**
     * 银行账号实体类
     */
    static class Account {
        // 账户余额：1000元
        private static int balance = 1000;

        // 取钱
        public static void drawMoney(int num) {
            balance = balance - num;
        }

        // 查询余额
        public static int checkMoney() {
            return balance;
        }
    }
}
