package methodreference;

import java.util.Comparator;

/**
 * @author liyi
 * @create 2021 -08 -20 -13:16
 */
public class Test03 { // 方法引用：静态方法
    public static void main(String[] args) {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        int compare = comparator.compare(12, 78);
        System.out.println(compare);

        // 方法引用：静态方法
        Comparator<Integer> comparator1 = Integer::compareTo;
        int compare1 = comparator1.compare(84, 25);
        System.out.println(compare1);
    }
}
