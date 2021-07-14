package sleep;

/**
 * @author liyi
 * @create 2021 -07 -14 -17:31
 */
public class ThreadSleep01 { // 线程睡眠：sleep
    public static void main(String[] args) throws InterruptedException {
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(300);  // 间断 30ms
        }
        System.out.println("开始！");
    }


}
