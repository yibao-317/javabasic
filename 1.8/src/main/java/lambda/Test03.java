package lambda;

/**
 * @author liyi
 * @create 2021 -08 -19 -0:25
 */
public class Test03 {
    public static void main(String[] args) {
        MyInterface03 mi = (a, b) -> {
            System.out.println("参数一：" + a + "   参数二：" + b);
            return "这是 Lambda 表达式中 多个形参 & 有返回值 的语法";
        };
        String back = mi.testMethod03(12, 17);
        System.out.println("执行方法，返回结果为：" + back);
    }
}

interface MyInterface03 {
    String testMethod03(int num1, int num2); // 多个参数 & 有返回值
}
