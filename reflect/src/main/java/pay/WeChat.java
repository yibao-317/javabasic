package pay;

/**
 * @author liyi
 * @create 2021 -08 -16 -23:56
 */
public class WeChat implements MeiTuan { // 继承美团
    // 空构造器
    public WeChat() {
        System.out.println("空构造器 --- 微信");
    }

    // 方法：支付方式
    public void pay() {
        System.out.println("...微信支付...");
    }

}
