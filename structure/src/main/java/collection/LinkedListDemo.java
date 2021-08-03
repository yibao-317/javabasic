package collection;

import java.util.LinkedList;

/**
 * @author liyi
 * @create 2021 -08 -03 -18:31
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        list.removeLast();  // JDK1.0 --->> 如果集合里面没有了，会报错，用户体验差
        list.pollLast();  // JDK1.6以后   --->> [] 不会报错

        System.out.println(list);
    }
}
