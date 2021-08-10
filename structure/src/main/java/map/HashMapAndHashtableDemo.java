package map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author liyi
 * @create 2021 -08 -11 -0:53
 */
public class HashMapAndHashtableDemo {
    public static void main(String[] args) {
        // 允许 空键、空值
        HashMap<Integer,String> map = new HashMap<>();
        map.put(null, "a");
        map.put(1002, "b");
        map.put(1003, "c");
        map.put(1001, "aaa");
        map.put(1004, null);
        System.out.println(map);

        System.out.println("------------------------------");

        // 不允许 空键、空值
        Hashtable<Integer,String> map2 = new Hashtable<>();
//        map2.put(null, "a");
        map2.put(1002, "b");
        map2.put(1003, "c");
        map2.put(1001, "aaa");
//        map2.put(1004, null);
        System.out.println(map2);
    }
}
