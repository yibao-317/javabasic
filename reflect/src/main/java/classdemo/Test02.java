package classdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author liyi
 * @create 2021 -08 -17 -22:46
 */
public class Test02 {  // 构造器 创建对象
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 获取class
        Class c1 = Class.forName("classdemo.Student");

        /*
            1、创建对象 【会调用父类的空构造器 + 此类的空构造器】
            2、必须有 空构造器 && public 修饰
         */
        Object o1 = c1.newInstance();
        System.out.println(o1);

        // 获取所有的构造器 【private获取不到】
        Constructor[] constructors = c1.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        // 获取所有的构造器 【包括 private】
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor c2 : declaredConstructors) {
            System.out.println(c2);
        }

        // 获取指定的构造器【public & private】
        Constructor con0 = c1.getConstructor();
        Constructor con1 = c1.getConstructor(double.class, char.class, int.class, String.class);
        System.out.println(con1);
        Constructor con2 = c1.getDeclaredConstructor(String.class, int.class, double.class, char.class, int.class, String.class);
        System.out.println(con2);

        System.out.println("---------------------------------------------------");

        // 利用构造器创建对象【public】
        Object o0 = con0.newInstance();
        System.out.println(o0);
        Object o2 = con1.newInstance(3.11, '女', 17, "哈哈哈");
        System.out.println(o2);
        // 利用构造器创建对象【private】
        con2.setAccessible(true); // 解除安全，不然private无法创建对象
        Object o3 = con2.newInstance("dasd", 213, 1.11, '男', 785, "浮白");
        System.out.println(o3);


    }
}
