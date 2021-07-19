package test;

/**
 * @author liyi
 * @create 2021 -07 -19 -16:08
 */
public class Consumer implements Runnable {  // 消费者
    // 同一个产品
    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (product) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("消费者消费了产品：" + product.getBrand() + "------>> " + product.getName());
            }
        }
    }
}
