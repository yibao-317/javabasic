package map;

import java.util.*;

/**
 * @author liyi
 * @create 2021 -08 -11 -0:09
 */
public class HashMapDemo { // 常用方法
    public static void main(String[] args) {
        // key值遵照哈希表原理，且 无序、唯一
        HashMap<Integer,String> map = new HashMap<>();

        // 想要 "有序"  ---->>> 使用
//        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        map.put(1005, "a"); // 被后面的 aaa 取代
        map.put(1002, "b");
        map.put(1003, "c");
        map.put(1001, "aaa");
        map.put(1004, "d");
        System.out.println(map);  // 结果：{1001=aaa, 1002=b, 1003=c, 1004=d}
        System.out.println(map.size());

        // 遍历
        // 对 key遍历
        Set<Integer> integers = map.keySet();
        for (Integer key : integers) {
            System.out.println(key);
        }
        System.out.println("--------------------");
        // 对 values遍历
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("--------------------");
        // 对 key/values 成对遍历
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"---->>"+entry.getValue());
        }

    }
}
