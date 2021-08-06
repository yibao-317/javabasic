package collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author liyi
 * @create 2021 -08 -06 -18:02
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        // 示例：在 “c” 的后面添加 “123”
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        /*
         * 用以下方式添加，会报错：ConcurrentModificationException  并发修改异常
         *      因为迭代器和集合都在试图改变同一个元素，并不知道该执行哪一个
         *
         */
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            if("c".equals(iterator.next())){
//                list.add("123");
//            }
//        }
//        System.out.println(list);


        /*
         *  ListIterator 的使用 --->> 添加元素
         */
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            if("c".equals(stringListIterator.next())){
                stringListIterator.add("123");
            }
        }
        System.out.println(list);

        /*
         *  ListIterator 的使用 --->> 倒序遍历
         */
        while (stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }


    }
}
