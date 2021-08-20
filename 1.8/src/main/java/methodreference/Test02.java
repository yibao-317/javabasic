package methodreference;

import java.util.function.Supplier;

/**
 * @author liyi
 * @create 2021 -08 -20 -11:11
 */
public class Test02 { // 方法引用：供给型示例
    public static void main(String[] args) {
        Student student = new Student("南一", 17, 175.4);
        // Lambda 供给型
        Supplier<String> supplier = () -> student.getName();  // getName方法 和 get方法一样，是无参数，返回String
        String name = supplier.get();
        System.out.println(name);

        // 方法引用：getName方法 和 get方法一样，是无参数，返回String，所以可以使用方法引用
        Supplier<String> supplier2 = student::getName;
        String name2 = supplier2.get();
        System.out.println(name);


    }
}
