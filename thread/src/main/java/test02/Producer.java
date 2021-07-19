package test02;

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
            if(i%2==0){
                product.produceGoods("品牌1111111","AAAAAAA");
            }else {
                product.produceGoods("品牌2222222","BBBBBBB");
            }
        }
    }
}
