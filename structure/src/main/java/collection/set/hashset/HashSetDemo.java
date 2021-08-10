package collection.set.hashset;

import java.util.LinkedHashSet;

/**
 * @author liyi
 * @create 2021 -08 -06 -23:07
 */
public class HashSetDemo {  // HashSet 底层是： 数组 + 链表
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<Integer>();
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();  // 有顺序的
        set.add(12);
        set.add(54);
        set.add(1);
        set.add(12);  // 特点： 无序 、 唯一
        set.add(167);
        set.add(6);
        System.out.println(set);

    }
}
