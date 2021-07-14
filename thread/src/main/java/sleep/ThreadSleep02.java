package sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liyi
 * @create 2021 -07 -14 -17:31
 */
public class ThreadSleep02 { // 线程睡眠：sleep  --->> 每秒钟控制台打印一次当前时间
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            Date date = new Date();
            String format = df.format(date);
            System.out.println(format);
            Thread.sleep(1000);  //睡一秒
        }


    }


}
