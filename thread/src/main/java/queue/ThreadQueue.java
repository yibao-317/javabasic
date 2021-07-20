package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author liyi
 * @create 2021 -07 -20 -11:03
 */
public class ThreadQueue { // 线程：队列
    public static void main(String[] args) throws InterruptedException {
        // 测试一
//        test01();

        // 测试二
        test02();
    }




    /**
     * 方法：
     */
    private static void test02() throws InterruptedException {
        // 假定：长度为3
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(3);
        /*
        区别：两者都是往队列尾部插入元素，不同的时候，当超出队列界限的时候，
                add（）方法是抛出异常让你处理
                offer（）方法是直接返回false
         */
        bq.offer("A");
        bq.offer("B");
        bq.offer("C");
        System.out.println(bq.poll());  // 先取一个出来，长度空出后，再装下一个
        bq.offer("D", 3, TimeUnit.SECONDS);  // 在..时间添加
        // 出队
        System.out.println(bq.poll());
        System.out.println(bq.poll());
        System.out.println(bq.poll());
//        System.out.println(bq.poll());  // 最后一次会取出 null，长度受限
    }




    /**
     * 方法：用于测试出队、入队
     */
    private static void test01() {
        // 无边界队列：即没有长度限制
        ConcurrentLinkedQueue clq = new ConcurrentLinkedQueue();
        // 入队
        clq.add("A");
        clq.add("B");
        clq.add("C");
        // 出队
        System.out.println(clq.poll());  // poll:会将元素从队列中移除
        System.out.println(clq.size());
        System.out.println(clq.peek());  // peek:不会将元素从队列中移除
        System.out.println(clq.size());
    }
}
