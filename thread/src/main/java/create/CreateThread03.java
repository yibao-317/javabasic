package create;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author liyi
 * @create 2021 -07 -14 -14:42
 */
public class CreateThread03 implements Callable<Integer> {  // 创建线程方式三：实现 callable
    // 重写 call方法，实现时用的什么泛型，重写方法就返回什么类型
    public Integer call() throws Exception {
        return new Random().nextInt(17);
    }
}
