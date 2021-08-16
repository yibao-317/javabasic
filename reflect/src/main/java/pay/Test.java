package pay;

/**
 * @author liyi
 * @create 2021 -08 -16 -23:59
 */
public class Test {
    public static void main(String[] args) {
        // 具体选择的方式
        String string = "微信";
        if ("支付宝".equals(string)) {
            pay(new Alipay());
        } else if ("微信".equals(string)) {
            pay(new WeChat());
        }
    }

    // 方法：支付 --->> 【利用了多态】
    public static void pay(MeiTuan m){
        m.pay();
    }
}
