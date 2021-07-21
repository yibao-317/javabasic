package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liyi
 * @create 2021 -07 -21 -16:13
 */
public class PoolType4 {  // 线程池类型四：单例
    public static void main(String[] args) {
        // 单例线程池
        ExecutorService es = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 50; i++) {
            es.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        // 关闭线程池
        es.shutdown();
    }
}
