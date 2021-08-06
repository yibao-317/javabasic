package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liyi
 * @create 2021 -08 -02 -13:56
 */
public class ListDemo {  // List 相关方法操作
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("asd");
        list.add("qwe");
        list.add(45);
        list.add(4.215);

        // 遍历方式一：普通for循环  【注意：List可以，Collection不行】
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------------");

        // 遍历方式二：增强for
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("-------------------------------");

        // 遍历方式三：迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
