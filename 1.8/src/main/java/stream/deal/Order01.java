package stream.deal;

import stream.Student;

import java.util.Arrays;
import java.util.List;

/**
 * @author liyi
 * @create 2021 -08 -20 -22:20
 */
public class Order01 { // 处理stream流：排序
    public static void main(String[] args) {
        // 自然排序  ---->>> 相当于内部比较器
        List<Integer> list = Arrays.asList(1, 45, 9, 65, 3, 74, 2);
        list.stream().sorted().forEach(System.out::println);

        // 自定义排序 --->>> 相当于外部比较器
        List<Student> list2 = Arrays.asList(
                new Student("yiyi", 17, "女", 175.3),
                new Student("erer", 16, "男", 145.3),
                new Student("sansan", 45, "男", 173.3),
                new Student("sisi", 23, "女", 112.3),
                new Student("wuwu", 57, "男", 185.8),
                new Student("qiqi", 78, "女", 195.2),
                new Student("qiqi", 78, "女", 195.2)
        );
        // 根据身高排序
        list2.stream().sorted((s1, s2) -> (int) (s1.getHeight() - s2.getHeight())).forEach(System.out::println);

    }
}
