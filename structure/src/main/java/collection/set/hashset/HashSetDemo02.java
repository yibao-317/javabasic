package collection.set.hashset;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author liyi
 * @create 2021 -08 -07 -0:05
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        // 如果hashset 装的是自定义的类，则该类需要重写 hashcode 、 equals方法
        HashSet<Student> set = new HashSet<Student>();
        set.add(new Student("a", 12));
        set.add(new Student("b", 4));
        set.add(new Student("a", 12));
        set.add(new Student("c", 67));
        System.out.println(set);
        System.out.println(set.size());
    }
}

class Student{
    private String name;
    private int age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
