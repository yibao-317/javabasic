package test;

/**
 * @author liyi
 * @create 2021 -07 -19 -16:07
 */
public class Producer implements Runnable {  // 生产者
    // 同一个商品
    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (product) {
                if (i % 2 == 0) {  // 【此处存在 品牌1 -->> 产品B 的现象】  --->> 加锁
                    product.setBrand("品牌1111111111");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    product.setName("产品AAAAAA");
                } else {
                    product.setBrand("品牌2222222222");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    product.setName("产品BBBBBB");
                }
                System.out.println("生产者生产了产品：" + product.getBrand() + "------>> " + product.getName());
            }
        }
    }
}
