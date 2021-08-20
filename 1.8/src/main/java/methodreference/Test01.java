package methodreference;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * @author liyi
 * @create 2021 -08 -19 -17:28
 */
public class Test01 { // 方法引用：消费型示例
    public static void main(String[] args) {
        // 利用消费型接口，在控制台打印一句话
        PrintStream ps = System.out;
        Consumer<String> consumer = string -> ps.println(string);
        consumer.accept("aaaaaa");

        /*
            根据上述示例，得出 方法引用 使用的条件：
                1、需要 接口中的抽象方法 和 具体的实现方法 返回值一样/参数一样
         */
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("..使用方法引用..");


    }
}
