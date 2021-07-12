package create;

/**
 * @author liyi
 * @create 2021 -07 -09 -14:32
 */
public class CreateThread02 implements Runnable{  // 创建线程的方式二：实现 Runnable
    // 重写 run 方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}
