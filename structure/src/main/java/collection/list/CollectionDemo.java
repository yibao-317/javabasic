package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection 接口相关方法操作
 *
 * @author liyi
 * @create 2021 -08 -02 -11:41
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("a");
        collection.add(12);
        collection.add(2.56);

        // 遍历方式一：增强for循环 【注意：collection不能使用普通for循环】  --->>> 快捷键：iter
        for (Object o : collection) {
            System.out.println(o);
        }

        System.out.println("--------------------------------------------------");

        // 遍历方式二：迭代器 Iterator 的使用
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }


    }

}
