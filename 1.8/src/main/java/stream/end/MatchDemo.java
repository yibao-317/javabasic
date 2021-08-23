package stream.end;

import stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author liyi
 * @create 2021 -08 -23 -23:49
 */
public class MatchDemo { // 终止操作
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
        // 是否所有都大于18岁
        boolean b = list.stream().allMatch((x) -> x.getAge() > 18);
        System.out.println(b);
        // 是否 至少有一个大于18岁
        boolean b1 = list.stream().anyMatch((x) -> x.getAge() > 18);
        System.out.println(b1);
        // 是否 没有一个大于80岁
        boolean b2 = list.stream().noneMatch((x) -> x.getAge() > 80);
        System.out.println(b2);

        // 找寻满足条件的第一个 -->> optional是1.8出来的，会把一切可能为空的对象放在这个容器里面
        Optional<Student> first =
                list.stream()
                        .sorted((x, y) -> (x.getAge() - y.getAge()))
                        .findFirst();
        System.out.println(first.get());

        // 找寻性别为女 的其中任意一个
        Optional<Student> any =
                list.stream()
                        .filter((x) -> "女".equals(x.getSex()))
                        .findAny();
        System.out.println(any.get());

        // 返回元素数
        long count = list.stream().count();
        System.out.println(count);

        // 获取元素中的年龄最大
        Optional<Student> max =
                list.stream()
                        .max((x, y) -> x.getAge() - y.getAge());
        System.out.println(max.get());

        // 获取元素中的身高最矮
        Optional<Student> min =
                list.stream()
                        .min((x, y) -> (int) (x.getHeight() - y.getHeight()));
        System.out.println(min);

    }
}
