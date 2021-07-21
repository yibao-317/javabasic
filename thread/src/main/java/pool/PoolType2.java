package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liyi
 * @create 2021 -07 -21 -16:13
 */
public class PoolType2 {  // 线程池类型二：定长
    public static void main(String[] args) {
        // 定长线程池
        ExecutorService es = Executors.newFixedThreadPool(3);
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
