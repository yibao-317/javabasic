package daemon;

/**
 * @author liyi
 * @create 2021 -07 -15 -15:18
 */
public class ThreadDaemon {  // 线程：测试 setDaemon方法 【守护线程】
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==7){
                // 创建子线程
                TestThread t1 = new TestThread();
                t1.setDaemon(true); // 设置守护线程 -->> "同生共死"
                t1.start();
            }
            System.out.println("main ---- "+i);
        }
    }

    /**
     * 线程：用于测试
     */
    static class TestThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.println("TestThread ----- "+i);
            }
        }
    }
}
