package methodreference;

import java.util.function.BiPredicate;

/**
 * @author liyi
 * @create 2021 -08 -20 -13:54
 */
public class Test04 { // 方法引用： 【类::实例】
    public static void main(String[] args) {
        /*
            比较两个字符串是否相等
                1、Lambda --->> BiPredicate<T,U>
         */
        BiPredicate<String, String> bp = (s1, s2) -> s1.equals(s2);
        System.out.println(bp.test("assda", "assda"));

        // 使用方法引用
        BiPredicate<String, String> bp1 = String::equals;
        System.out.println(bp1.test("acd", "acd"));

    }
}
