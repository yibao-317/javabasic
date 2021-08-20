package consreference;

import java.util.function.Function;

/**
 * @author liyi
 * @create 2021 -08 -20 -15:05
 */
public class Test02 { // 数组的引用
    public static void main(String[] args) {
        /*
            创建一个长度为5的数组
                1、Lambda 表达式
         */
        Function<Integer, String[]> function = (x) -> new String[x];
        String[] apply = function.apply(5);
        System.out.println(apply.length);

        // 数组引用
        Function<Integer, String[]> function1 = String[]::new;
        String[] apply1 = function1.apply(7);
        System.out.println(apply1.length);
    }
}
