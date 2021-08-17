package classdemo;

import java.lang.reflect.Field;

/**
 * @author liyi
 * @create 2021 -08 -17 -23:39
 */
public class Test03 { // 属性
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class c1 = Class.forName("classdemo.Student");
        // 获取属性【public】
        Field[] fields = c1.getFields();
        for (Field f1 : fields) {
            System.out.println(f1);
        }
        System.out.println("-------------------------");
        // 获取属性【public & private】
        Field[] fields1 = c1.getDeclaredFields();
        for (Field f2 : fields1) {
            System.out.println(f2);
        }
        System.out.println("-------------------------");
        // 获取指定属性【public & private】
        Field field = c1.getField("love");
        System.out.println(field);
        Field field1 = c1.getDeclaredField("height");
        System.out.println(field1);
        System.out.println("-------------------------");
        // 属性赋值【public】
        Student student = (Student)c1.newInstance();
        field.set(student, "哈哈哈");
        System.out.println(student);
        // 属性赋值【private】
        field1.setAccessible(true);
        field1.set(student, 17);
        System.out.println(student);
    }
}
