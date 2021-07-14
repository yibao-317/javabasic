package create;

/**
 * @author liyi
 * @create 2021 -07 -09 -17:49
 */
public class TicketTest02 {  // 线程：买票练习【实现 Runnable接口的方式】
    public static void main(String[] args) {
        // 共用一个对象，不用重复构建了
        Railway02 ticket = new Railway02();
        // 创建线程
        Thread t1 = new Thread(ticket, "窗口1");
        t1.start();
        Thread t2 = new Thread(ticket, "窗口2");
        t2.start();
        Thread t3 = new Thread(ticket, "窗口3");
        t3.start();

    }

    /**
     * 火车票的线程类 【实现 Runnable接口的方式】
     */
    static class Railway02 implements Runnable {
        // 定义火车票总数 【不用static申明了】
        private int num = 10;

        // 重写 run 方法
        public void run() {
            for (int i = 0; i < 20; i++) {
                if (num > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() + "买到了火车票，当前还剩" + (--num) + "张");
                } else {
                    break;
                }
            }
        }
    }


}
