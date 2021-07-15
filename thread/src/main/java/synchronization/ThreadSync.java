package synchronization;

/**
 * @author liyi
 * @create 2021 -07 -15 -16:09
 */
public class ThreadSync {  // 线程：测试同步加锁  --- 购买火车票   ---->> 同步代码块
    public static void main(String[] args) {
        // 创建线程
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "1-售票口");  // 共用一个线程对象
        Thread t2 = new Thread(ticket, "2-售票口");
        Thread t3 = new Thread(ticket, "3-售票口");
        t1.start();
        t2.start();
        t3.start();
    }

    /**
     * 线程：买票
     */
    static class Ticket implements Runnable {
        // 总票数
        private int num = 10;

        public void run() {
            for (int i = 0; i < 100; i++) {
//                synchronized (this) {  // 加锁 --->> 锁住当前线程【因为共用一个线程，所以用的是"this"】
//                    if (num > 0) {
//                        System.out.println("我在" + Thread.currentThread().getName() + "买到了票，还剩" + (--num) + "张");
//                    }
//                }

                // 使用同步方法
                SyncMethod();
            }
        }

        // 同步方法
        public synchronized void SyncMethod(){
            if (num > 0) {
                System.out.println("我在" + Thread.currentThread().getName() + "买到了票，还剩" + (--num) + "张");
            }
        }
    }
}
