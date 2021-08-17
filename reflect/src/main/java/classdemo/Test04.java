package classdemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author liyi
 * @create 2021 -08 -17 -23:56
 */
public class Test04 { // 反射：操纵类方法
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class c1 = Class.forName("classdemo.Student");
        // 获取所有的方法【public & private】
        Method[] methods = c1.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("--------------------------------");
        // 获取指定的方法
        Method m2 = c1.getMethod("say", int.class);
        System.out.println("方法的名字：" + m2.getName());
        System.out.println("方法的修饰符：" + Modifier.toString(m2.getModifiers()));
        System.out.println("方法的返回值类型：" + m2.getReturnType().getSimpleName());
        System.out.println("方法的参数："+ Arrays.toString(m2.getParameterTypes()));
        System.out.println("-----------------------------------");
        // 执行方法
        Object o = c1.newInstance();
        m2.invoke(o, 55);
    }
}
