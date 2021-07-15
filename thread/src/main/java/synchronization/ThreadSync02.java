package synchronization;

/**
 * @author liyi
 * @create 2021 -07 -15 -22:05
 */
public class ThreadSync02 {  // 线程：测试加锁  --->> 同步代码块
    public static void main(String[] args) {
        // 创建线程
        Ticket t1 = new Ticket();  // 不共用一个线程对象，如果"锁"是"this"，则无法锁住
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        t1.start();
        t2.start();
        t3.start();
    }

    /**
     * 线程类
     */
    static class Ticket extends Thread {
        // 总票数
        private static int num = 10;

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                synchronized (Ticket.class) {  // 不共用一个线程对象，如果"锁"是"this"，则无法锁住
                    if (num > 0) {
                        System.out.println("我在" + this.getName() + "买到了票，还剩" + (--num) + "张");
                    }
                }
            }
        }
    }
}
