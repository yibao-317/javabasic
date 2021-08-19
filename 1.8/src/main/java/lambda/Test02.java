package lambda;

/**
 * @author liyi
 * @create 2021 -08 -18 -23:46
 */
public class Test02 {
    public static void main(String[] args) {
        // 利用 Lambda 表达式 【如果方法体有多句，需要加上 {} 花括号】
        MyInterface02 mi = (int a) -> {
            System.out.println("方法参数为：" + a);
        };
        mi.testMethod02(17);
        System.out.println("-------------------------------");
        MyInterface02 mi2 = (b) -> {
            System.out.println("方法参数为：" + b);
        };
        mi2.testMethod02(23);
        System.out.println("-------------------------------");
        MyInterface02 mi3 = c -> {
            System.out.println("方法参数为：" + c);
        };
        mi3.testMethod02(99);
    }
}

@FunctionalInterface   // 注解：用于检测函数式接口
interface MyInterface02 {
    void testMethod02(int num); // 一个参数 & 无返回值
}
