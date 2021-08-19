package funcinterface.consumer;

/**
 * @author liyi
 * @create 2021 -08 -19 -14:45
 */
public class Test01 { // 在使用消费型函数式接口前的代码写法
    public static void main(String[] args) {
        // 创建对象
        SpendMoney sm = new SpendMoney() {
            @Override
            public void buy(double money) {
                System.out.println("我花了" + money + "购买滑板");
            }
        };
        // 调用方法
        buySomething(1999, sm);
    }

    // 方法：买东西
    public static void buySomething(double money, SpendMoney sm) {
        sm.buy(money);
    }
}

interface SpendMoney {
    // 抽象方法：买东西
    void buy(double money);
}
