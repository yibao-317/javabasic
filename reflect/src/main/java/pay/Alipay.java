package pay;

/**
 * @author liyi
 * @create 2021 -08 -16 -23:58
 */
public class Alipay implements MeiTuan { // 继承美团
    // 空构造器
    public Alipay() {
        System.out.println("空构造器 --- 支付宝");
    }

    // 方法：支付方式
    public void pay() {
        System.out.println("...支付宝支付...");
    }

}
