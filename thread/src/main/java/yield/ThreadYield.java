package yield;

/**
 * @author liyi
 * @create 2021 -07 -15 -14:25
 */
public class ThreadYield {
    public static void main(String[] args) {
        // 创建线程
        YieldTest t1 = new YieldTest("线程1");
        t1.start();
        YieldTest t2 = new YieldTest("线程2");
        t2.start();
    }

    /**
     * 线程类：测试 yield方法
     */
    static class YieldTest extends Thread {
        public YieldTest() {
        }

        public YieldTest(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (i == 7) {
                    yield();  // 暂停当前线程，使当前线程变为 "就绪阶段"
                    setDaemon(true);
                }
                System.out.println(this.getName() + "----" + i);
            }
        }

    }
}
