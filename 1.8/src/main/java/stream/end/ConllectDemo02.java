package stream.end;

import stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author liyi
 * @create 2021 -08 -24 -21:24
 */
public class ConllectDemo02 { // 终止：收集
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

        // 求总人数
        Long count = list.stream()
                .collect(Collectors.counting());
        System.out.println("总人数为： " + count);

        // 求身高总和
        Double sum = list.stream()
                .collect(Collectors.summingDouble((x) -> x.getHeight()));
        System.out.println("身高总和为： " + sum);

        // 求身高平均值
        Double avg = list.stream()
                .collect(Collectors.averagingDouble((x) -> x.getHeight()));
        System.out.println("身高平均值为： " + avg);

        // 求年龄最大
        Optional<Student> max = list.stream()
                .collect(Collectors.maxBy((x, y) -> x.getAge() - y.getAge()));
        System.out.println("年龄最大为： " + max.get());

        // 求年龄最小
        Optional<Student> min = list.stream()
                .collect(Collectors.minBy((x, y) -> x.getAge() - y.getAge()));
        System.out.println("年龄最小为： " + min.get());


    }
}
