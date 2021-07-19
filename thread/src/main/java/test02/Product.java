package test02;

/**
 * @author liyi
 * @create 2021 -07 -19 -16:07
 */
public class Product {  // 产品
    private String brand;  // 品牌
    private String name; // 产品名称
    private boolean flag = false;  // 标志，用来判断锁的持有,假定 false为需要生产，true为需要消费

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 方法：生产商品
    public synchronized void produceGoods(String brand, String name) {
        if (flag) {  // 有产品，需要消费
            try {
                wait();  // Object 的方法 ， 等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 没有产品，就执行生产  【注意：不能将执行代码写在else里面，因为重新获得锁后，是执行 wait方法后面的代码】
        this.setBrand(brand);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了产品：" + this.getBrand() + "------>> " + this.getName());

        // 生产完，改变标志位 & 通知消费者来消费
        flag = true;
        notify();  //唤醒
    }

    // 方法：消费商品
    public synchronized void consumeGoods() {
        if (!flag) {  // 没有产品，需要生产
            try {
                wait(); // 消费等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 有产品，执行消费
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者消费了产品：" + this.getBrand() + "------>> " + this.getName());

        // 消费完，改变标志位 & 告诉生产者开始生产
        flag = false;
        notify();
    }
}
