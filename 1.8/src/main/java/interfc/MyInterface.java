package interfc;

/**
 * @author liyi
 * @create 2021 -08 -24 -22:29
 */
public interface MyInterface { // JDK1.8以后，可以有默认方法
    // 常量
    public static final int NUM = 17;

    // 抽象方法
    public abstract int methodTest(int a);

    // 默认方法（default不能省略）
    default String test() {
        return "我是接口中的默认方法！";
    }

    // 父类
    class SuperClass {
        public String test() {
            return "我是父类中的test方法";
        }
    }

    // 接口二
    interface MyInterface02 {
        // 默认方法（default不能省略）
        default String test() {
            return "我是接口222222中的默认方法！";
        }
    }

    // 继承类
    class Test implements MyInterface, MyInterface02 {
        @Override
        public int methodTest(int a) {
            return a;
        }

        @Override
        public String test() {
            return "自己的test方法！";
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        // 实现的接口中如果有相同的默认方法，则需要类自己重写实现方法
        System.out.println(test.test());

        // 可以直接调用 "默认方法"
//        System.out.println(test.test());

        // 如果继承父类，则会忽略接口中的相同方法，而执行父类的
//        System.out.println(test.test());



    }


}
