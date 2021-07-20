package pool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author liyi
 * @create 2021 -07 -20 -13:56
 */
public class ThreadPool {  // 线程池
    public static void main(String[] args) {
        // 创建线程池 [核心线程数，最大线程数，创建新线程等待消亡的时间，时间单位，阻塞队列（有参：长度）]
        ThreadPoolExecutor tpe =
                new ThreadPoolExecutor(1, 2, 3, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3));
        // 执行任务 【任务：即run里面执行的东西】
        // 第一个任务  --->> 核心线程
        tpe.execute(new ThreadTest());
        // 2/3/4 个任务  --->> 会在队列里面等待核心线程
        tpe.execute(new ThreadTest());
        tpe.execute(new ThreadTest());
        tpe.execute(new ThreadTest());
        // 5个任务  --->> 创建新线程去执行  【此时共有两个线程执行任务，随机分摊】
        tpe.execute(new ThreadTest());
        // 6个任务  --->> 已经超过最大线程数，报错
        tpe.execute(new ThreadTest());


        // 关闭线程池
        tpe.shutdown();

    }

    /**
     * 测试线程
     */
    static class ThreadTest implements Runnable{
        public void run() {
            // 打印线程的名称
            System.out.println(Thread.currentThread().getName());
        }
    }
}
