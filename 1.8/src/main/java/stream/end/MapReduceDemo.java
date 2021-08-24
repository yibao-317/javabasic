package stream.end;

import stream.Student;

import java.util.Arrays;
import java.util.List;

/**
 * @author liyi
 * @create 2021 -08 -24 -11:51
 */
public class MapReduceDemo { // map-reduce 模式
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

        // 求取所有学生的年龄和
        Integer sum1 = list.stream()
                .map((s) -> s.getAge())
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum1);

        Integer sum2 = list.stream()
                .map((x) -> x.getAge())
                .reduce(0, (x, y) -> Integer.sum(x, y));
        System.out.println(sum2);

        Integer sum3 = list.stream()
                .map((x) -> x.getAge())
                .reduce(0, Integer::sum); // 方法引用
        System.out.println(sum3);


    }
}
