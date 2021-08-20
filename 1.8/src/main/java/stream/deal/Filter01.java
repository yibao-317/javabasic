package stream.deal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author liyi
 * @create 2021 -08 -20 -17:59
 */
public class Filter01 { // 处理stream ：筛选与切片
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("yiyi", 17, "女", 175.3),
                new Student("erer", 16, "男", 145.3),
                new Student("sansan", 45, "男", 173.3),
                new Student("sisi", 23, "女", 112.3),
                new Student("wuwu", 57, "男", 185.8),
                new Student("qiqi", 78, "女", 195.2),
                new Student("qiqi", 78, "女", 195.2)
        );

        test05(list);
    }


    /**
     * distinct 去重
     * @param list
     */
    public static void test05(List<Student> list) {
        // distinct & 链式优化
        list.stream().filter((student -> student.getAge() > 18)).distinct().forEach(System.out::println);
    }


    /**
     * 丢弃掉前 n个
     *
     * @param list
     */
    public static void test04(List<Student> list) {
        // skip & 链式优化  --->>> 与 limit 互补
        list.stream().filter((student -> student.getAge() > 18)).skip(1).forEach(System.out::println);
    }

    /**
     * 只要 n个
     *
     * @param list
     */
    public static void test03(List<Student> list) {
        // limit & 链式优化
        list.stream().filter((student -> student.getAge() > 18)).limit(2).forEach(System.out::println);
    }

    /**
     * 使用链式的方式，优化test01
     *
     * @param list
     */
    public static void test02(List<Student> list) {
        // 链式优化
        list.stream().filter((student -> student.getAge() > 18)).forEach(System.out::println);
    }


    /**
     * 方法：筛选年龄大于18岁的
     *
     * @param list
     */
    public static void test01(List<Student> list) {
        // 1、创建流
        Stream<Student> stream = list.stream();
        // 2、处理流
        Stream<Student> s1 = stream.filter((student) -> student.getAge() > 18);
        // 3、终止操作
        s1.forEach(System.out::println);
    }
}
