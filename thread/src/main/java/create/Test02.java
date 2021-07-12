package create;

/**
 * @author liyi
 * @create 2021 -07 -12 -22:21
 */
public class Test02 {  // 测试类
    public static void main(String[] args) {
        // 注意：线程创建方式二，实现 Runnable -->> 启动方式
        CreateThread02 thread = new CreateThread02();
        Thread t = new Thread(thread);  // 此处利用了 "静态代理模式"
        t.start();

        // 主线程执行
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }


    }
}
