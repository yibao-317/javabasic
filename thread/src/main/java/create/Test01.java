package create;

/**
 * @author liyi
 * @create 2021 -07 -09 -14:26
 */
public class Test01 { // 测试线程类
    public static void main(String[] args) {
        // 设置线程名称
        Thread.currentThread().setName("the main ");

        // 此时为主线程，不存在抢占资源
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->> "+i);  // 获取当前线程的名称
        }

        // 创建线程类【相当于在主线程中，创建了子线程】
//        CreateThread01 createThread01 = new CreateThread01();
        // 利用有参构造器，创建线程时为线程取名
        CreateThread01 createThread01 = new CreateThread01("Thread01");
//        createThread01.setName("T01");  // 设置线程名称
//        createThread01.run();  // 调用 run方法会顺序执行 -->> 调用run的时候会沿用主线程来执行方法，调用start方法的时候会用子线程执行方法
        createThread01.start(); // 调用start方法，会执行 run

        // 主线程中的程序，和上面的线程类抢占资源
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->> "+i);
        }


    }
}
