package test;

/**
 * @author liyi
 * @create 2021 -07 -19 -16:46
 */
public class Test {  //测试类
    public static void main(String[] args) {
        Product product = new Product();
        // 生产者
        Producer producer = new Producer(product);
        Thread t1 = new Thread(producer);
        t1.start();

        // 消费者
        Consumer consumer = new Consumer(product);
        Thread t2 = new Thread(consumer);
        t2.start();
    }
}
