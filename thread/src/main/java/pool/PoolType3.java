package pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author liyi
 * @create 2021 -07 -21 -16:13
 */
public class PoolType3 {  // 线程池类型三：定时
    public static void main(String[] args) {
        // 定时线程池
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);
        for (int i = 0; i < 50; i++) {
            ses.schedule(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            }, 3, TimeUnit.SECONDS);
        }
        // 关闭线程池
        ses.shutdown();
    }

}
