package classdemo;

import java.lang.reflect.Modifier;

/**
 * @author liyi
 * @create 2021 -08 -17 -11:45
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException { // 获取对象字节码信息的方式
        // 方式一
        Student s1 = new Student();
        Class c1 = s1.getClass();
        System.out.println(c1);
        // 方式二
        Class c2 = Student.class;
        System.out.println(c2);
        System.out.println(c1==c2);
        // 方式三：真正在实际运用中使用的
        Class c3 = Class.forName("classdemo.Student");
        System.out.println(c3);


        // 方法
        System.out.println("类的全称: " + c3.getName());
        System.out.println("类的简称: " + c3.getSimpleName());
        System.out.println("类的修饰符: " + c3.getModifiers()); // 结果是数字，由二进制转十进制
        System.out.println("类的修饰符，显示表示: " + Modifier.toString(c3.getModifiers()));
        System.out.println("父类class: " + c3.getSuperclass());



    }
}
