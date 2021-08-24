package stream.end;

import stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author liyi
 * @create 2021 -08 -24 -21:24
 */
public class ConllectDemo { // 终止：收集
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

        // 把每一个学生的姓名放进一个 list 集合
        List<String> list1 = list.stream()
                .map((x) -> x.getName())
                .collect(Collectors.toList());
        for (String name : list1) {
            System.out.println(name);
        }

        System.out.println("-------------------------------------------");

        // 放进 set 集合 【会去重】
        Set<String> set = list.stream()
                .map((x) -> x.getName())
                .collect(Collectors.toSet());
        for (String name2 : set) {
            System.out.println(name2);
        }

        System.out.println("-------------------------------------------");

        // 放进 map 集合 【K(名字)：V(年龄)】  --->>> 键 K 不能重复
        Map<String, Integer> map = list.stream()
                .distinct()
                .collect(Collectors.toMap((x) -> x.getName(), (y) -> y.getAge()));
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }


    }
}
