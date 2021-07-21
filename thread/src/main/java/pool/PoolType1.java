package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liyi
 * @create 2021 -07 -21 -15:32
 */
public class PoolType1 {  // 线程池类型一：可缓存
    public static void main(String[] args) {
        // 底层用的也是 ThreadPoolExecutor
        ExecutorService es = Executors.newCachedThreadPool();  // 会有同线程执行任务
        for (int i = 0; i < 100; i++) {
            // 执行线程池
            es.execute(new Runnable() {
                // 使用匿名内部类
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        // 执行完毕，关闭线程池
        es.shutdown();

    }




}
