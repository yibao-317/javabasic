package collection.set.treeset;

import java.util.TreeSet;

/**
 * @author liyi
 * @create 2021 -08 -09 -14:16
 */
public class TreeSetDemo02 {  // 使用内部比较器
    public static void main(String[] args) {
        // TreeSet 自定义类
        TreeSet<Student> set = new TreeSet<Student>();
        set.add(new Student("ayiyi", 12));
        set.add(new Student("byiyi", 16));
        set.add(new Student("cyiyi", 12));
        set.add(new Student("ayiyi", 32));
        set.add(new Student("dyiyi", 9));
        System.out.println(set);
        System.out.println(set.size());
    }
}

/**
 * 类：学生
 */
class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        // 设定比较规则
        // 1、根据年龄做比较
//        return this.age - o.age;
        // 2、根据名字做比较
        return this.name.compareTo(o.name);
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
