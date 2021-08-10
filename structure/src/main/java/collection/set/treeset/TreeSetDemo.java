package collection.set.treeset;

import java.util.TreeSet;

/**
 * @author liyi
 * @create 2021 -08 -09 -13:43
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(12);
        set.add(39);
        set.add(98);
        set.add(12);
        set.add(6);
        set.add(14);
        System.out.println(set);  // 有序 [6, 12, 14, 39, 98] 、 无序 、 唯一
        System.out.println(set.size());
    }
}
