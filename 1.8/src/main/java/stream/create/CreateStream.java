package stream.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author liyi
 * @create 2021 -08 -20 -17:40
 */
public class CreateStream { // 创建 Stream 的方式
    public static void main(String[] args) {
        // 方式一：Collection接口的方式
        Collection<Integer> collection = new ArrayList<>();
        Stream<Integer> s1 = collection.stream(); // 获取串行流
        Stream<Integer> s2 = collection.parallelStream(); // 获取并行流

        // 方式二：通过Arrays中的stream方法，参数传什么类型的数组，就会返回什么类型的流
        IntStream s3 = Arrays.stream(new int[]{1, 2, 3});

        // 方式三：Stream中的of方法
        Stream<String> s4 = Stream.of("aaa", "bbb", "ccc");

        // 方式四：Stream中的方式 -> 创作无限流，结果会生成很多
        Stream<Integer> s5 = Stream.iterate(17, (x) -> x + 1);  // 参数二继承了函数式接口
//        s5.forEach(System.out::println);   // 证明迭代

        Stream<Double> s6 = Stream.generate(() -> Math.random());
        s6.forEach(System.out::println);

    }
}
