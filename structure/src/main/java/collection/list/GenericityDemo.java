package collection.list;

/**
 * @author liyi
 * @create 2021 -08 -03 -15:28
 */
public class GenericityDemo<AA> { // 泛型类，此时的类型并没有确定
    /**
     * 泛型方法
     */
    public void a() { // 普通方法
    }

    public void b(AA a) { // 此方法是对象的方法，由对象调用，创建对象时会明确泛型类型
    }

    public <BB> void c(BB b) { // 调用时确认
    }

//    public static void d(AA a){}  【注意：此方法不行，因为static，此时还不确定泛型类型】

    public static <BB> void e(BB b) { // 方法调用时，确认泛型类型
    }

    public void f(AA[] a) { // 数组也可以
    }

    public <Q> void g(Q... q) { // 省略参数
    }

    public <Q> Q[] h(Q...q){
        for (Q q1 : q) {
            System.out.println(q1);
        }
        return q; // 此处返回 q --->> 省略参数其实就是 "数组"
    }

    public static void main(String[] args) {
        // 泛型类创建对象
        GenericityDemo<String> g = new GenericityDemo<String>();
    }
}
