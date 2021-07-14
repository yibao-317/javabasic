package create;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author liyi
 * @create 2021 -07 -14 -14:45
 */
public class Test03 {  // 测试创建线程方式三：实现 callable
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程【方式较为复杂】
        CreateThread03 thread = new CreateThread03();
        FutureTask<Integer> ft = new FutureTask<Integer>(thread);
        Thread t = new Thread(ft);
        // 开启线程
        t.start();
        // 需要手动获取返回值
        System.out.println(ft.isDone()); // 线程是否结束
        System.out.println(ft.get());  //重写返回什么类型，此处就是什么类型
        System.out.println(ft.isDone()); // 线程是否结束【只有返回值返回后，线程才结束】

    }
}
