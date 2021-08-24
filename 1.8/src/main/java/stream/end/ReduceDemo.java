package stream.end;

import java.util.Arrays;
import java.util.List;

/**
 * @author liyi
 * @create 2021 -08 -24 -10:49
 */
public class ReduceDemo { // 终止操作：归约
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 45, 8, 4);
        // 参数一：x的起始值 参数二：会依次取集合中的元素做相应操作
        Integer reduce = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
    }
}
