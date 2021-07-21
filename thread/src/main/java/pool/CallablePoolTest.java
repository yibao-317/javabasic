package pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author liyi
 * @create 2021 -07 -21 -17:26
 */
public class CallablePoolTest {  // 线程池处理 Callable
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        test01();
        test02();
    }


    /**
     * Callable 处理线程池【改善速度】
     *
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static void test02() throws ExecutionException, InterruptedException {
        // 创建线程池，此处以定长为例
        ExecutorService es = Executors.newFixedThreadPool(5);
        // 用list来装，一次执行5个
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < 50; i++) {
            // 拿到返回值
            Future<String> result = es.submit(new Callable<String>() {  // 使用callable --->> submit方法
                public String call() throws Exception {
                    // 睡3秒
                    Thread.sleep(2000);
                    return Thread.currentThread().getName();
                }
            });
            list.add(result);
        }
        // 取出来获取返回值
        for (Future future : list) {
            System.out.println(future.get());  // 实际的延时是这里
        }

        // 关闭线程池
        es.shutdown();
    }

    /**
     * Callable 处理线程池【未改善】
     */
    private static void test01() throws ExecutionException, InterruptedException {
        // 创建线程池，此处以定长为例
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 50; i++) {
            // 拿到返回值
            Future<String> result = es.submit(new Callable<String>() {  // 使用callable --->> submit方法
                public String call() throws Exception {
                    // 睡3秒
                    Thread.sleep(2000);
                    return Thread.currentThread().getName();
                }
            });
            // 打印返回值
            System.out.println(result.get());  // 获取每次都会等2秒，被阻塞了，效果：2秒一个线程执行，1~5轮询
        }
        // 关闭线程池
        es.shutdown();
    }


}
