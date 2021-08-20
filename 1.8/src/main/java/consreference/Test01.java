package consreference;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author liyi
 * @create 2021 -08 -20 -14:08
 */
public class Test01 { // 方法引用：构造器
    public static void main(String[] args) {
        // Lambda 供给型，返回一个学生对象
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get());

        // 使用构造器引用 【调用无参构造器】
        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get());

        // 调用有参构造器 --->> Function
        Function<String, Student> function = (x) -> new Student(x);
        System.out.println(function.apply("南一"));

        Function<String, Student> function1 = Student::new;
        System.out.println(function1.apply("浮白"));

    }
}
