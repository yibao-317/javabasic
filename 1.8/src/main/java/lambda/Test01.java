package lambda;

/**
 * @author liyi
 * @create 2021 -08 -18 -23:16
 */
public class Test01 {
    public static void main(String[] args) {
        // 方式一：创建接口实现类的对象
        MyClass myClass = new MyClass();
        myClass.testMethod();

        // 方式二：利用匿名内部类创建对象
        MyInterface myInterface = new MyInterface() {
            public void testMethod() {
                System.out.println("利用匿名内部类重写了 MyInterface 中的方法");
            }
        };
        myInterface.testMethod();

        // 方式三：利用 Lambda 表达式
        MyInterface mi2 = () -> System.out.println("利用 Lambda 表达式重写了 MyInterface 中的方法");
        mi2.testMethod();
    }
}

interface MyInterface {
    void testMethod(); // 无形参 & 无返回值
}

class MyClass implements MyInterface {
    public void testMethod() {
        System.out.println("重写 MyInterface 中的方法");
    }
}
