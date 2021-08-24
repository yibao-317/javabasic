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
public class ConllectDemo03 { // 终止：收集
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("yiyi", 17, "女", 175.3),
                new Student("erer", 16, "男", 145.3),
                new Student("sansan", 45, "男", 173.3),
                new Student("sisi", 23, "女", 112.3),
                new Student("wuwu", 23, "男", 185.8),
                new Student("qiqi", 78, "女", 195.2),
                new Student("qiqi2", 78, "女", 195.2)
        );

        // 分组：根据年龄进行分组
        Map<Integer, List<Student>> map = list.stream()
                .collect(Collectors.groupingBy((x) -> x.getAge()));
        Set<Map.Entry<Integer, List<Student>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<Student>> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }


        // 分区：年龄大于18的进行分区处理
        Map<Boolean, List<Student>> map1 = list.stream()
                .collect(Collectors.partitioningBy((x) -> x.getAge() > 18));
        Set<Map.Entry<Boolean, List<Student>>> entries1 = map1.entrySet();
        for (Map.Entry<Boolean, List<Student>> m : entries1) {
            System.out.println(m.getKey() + "----" + m.getValue());
        }


        // 连接：将所有学生的姓名拼接起来
        String s = list.stream()
                .map((x) -> x.getName() + "--")
                .collect(Collectors.joining());
        System.out.println(s);


    }
}
