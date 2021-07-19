package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyi
 * @create 2021 -07 -19 -14:50
 */
public class ThreadLock {  // 线程：手动加锁
    public static void main(String[] args) {
        // 创建线程
        LockTest lock = new LockTest();
        Thread t1 = new Thread(lock, "售票口-1");
        Thread t2 = new Thread(lock, "售票口-2");
        Thread t3 = new Thread(lock, "售票口-3");
        t1.start();
        t2.start();
        t3.start();

    }

    /**
     * 线程类：测试锁
     */
    static class LockTest implements Runnable {
        // 总票数
        private int num = 10;

        // 创建锁
        Lock lock = new ReentrantLock();

        public void run() {
            for (int i = 0; i < 100; i++) {
                lock.lock();  // 加锁
                try {
                    if (num > 0) {  // 这段代码有可能会抛出异常，从而导致未关锁，所以使用 try/finally
                        System.out.println(Thread.currentThread().getName() + "购票成功，还剩：" + (--num) + "张");
                    }
                } finally {
                    lock.unlock(); // 解锁
                }
            }
        }
    }


}
