package stream.deal;

import java.util.Arrays;
import java.util.List;

/**
 * @author liyi
 * @create 2021 -08 -20 -21:33
 */
public class Map01 { // stream处理：映射
    public static void main(String[] args) {
        // 将集合中的小写 --->> 大写
        List<String> list = Arrays.asList("asdc", "cr", "fvc", "ADcf");
        list.stream().map((x) -> x.toUpperCase()).forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        List<Student> list2 = Arrays.asList(
                new Student("yiyi", 17, "女", 175.3),
                new Student("erer", 16, "男", 145.3),
                new Student("sansan", 45, "男", 173.3),
                new Student("sisi", 23, "女", 112.3),
                new Student("wuwu", 57, "男", 185.8),
                new Student("qiqi", 78, "女", 195.2),
                new Student("qiqi", 78, "女", 195.2)
        );
        // 获取年龄大于18的学生的名字,并去重
        list2.stream().filter((student -> student.getAge() > 18)).map((x) -> x.getName()).distinct().forEach(System.out::println);

    }
}
