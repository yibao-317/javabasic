package funcinterface.consumer;

import java.util.function.Consumer;

/**
 * @author liyi
 * @create 2021 -08 -19 -14:37
 */
public class Consumer02 { // 函数式接口：消费型【迭代版2】
    public static void main(String[] args) {
        // 创建消费型对象
        Consumer<Double> consumer = money ->
                System.out.println("我花了" + money + "元，购买了滑板");

        // 调用方法
        consumer.accept(1845.0);
    }

    // 方法：买东西
    public static void buySomething(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }
}


