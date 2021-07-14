package create;

/**
 * @author liyi
 * @create 2021 -07 -09 -17:49
 */
public class TicketTest {  // 线程：买票练习
    public static void main(String[] args) {
        // 创建3个窗口，用来买票
        Railway railway1 = new Railway("窗口1");
        Railway railway2 = new Railway("窗口2");
        Railway railway3 = new Railway("窗口2");
        railway1.start();
        railway2.start();
        railway3.start();

    }


    /**
     * 火车票的线程类
     */
    static class Railway extends Thread {
        // 所有线程共用10张火车票
        private static int num = 10; // 注意 static --->> 才能保证每个新生成的线程用的都是这10张票

        // 构造器
        public Railway() {
        }

        public Railway(String name) {
            super(name);
        }

        @Override
        public void run() {
            // 假设每个窗口有20人在排队抢票
            for (int i = 0; i < 20; i++) {
                if (num > 0) {
                    System.out.println("我在" + this.getName() + "买到了火车票，当前还剩" + (--num) + "张");
                } else {
                    break;
                }
            }
        }
    }


}
