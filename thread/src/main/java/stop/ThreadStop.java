package stop;

/**
 * @author liyi
 * @create 2021 -07 -15 -15:49
 */
public class ThreadStop {  // 线程：测试 stop方法
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-----" + i);
            if (i == 7) {
                Thread.currentThread().stop();  // 线程停止
            }
        }

    }
}
