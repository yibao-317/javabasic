package collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author liyi
 * @create 2021 -08 -09 -14:31
 */
public class TreeSetDemo03 {  // 使用外部比较器
    public static void main(String[] args) {
        Comparator<Student2> comparator = new BiJiao();
//        TreeSet<Student2> set = new TreeSet<>(comparator);  // 也可以不用 BiJiao类，直接匿名内部类

        TreeSet<Student2> set = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
//                return o1.getAge() - o2.getAge();
                int i = o1.getAge() - o2.getAge();
                if(i!=0){
                    return i;
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        set.add(new Student2("alili", 12));
        set.add(new Student2("blili", 6));
        set.add(new Student2("alili", 34));
        set.add(new Student2("clili", 12));
        System.out.println(set);
        System.out.println(set.size());
    }

}

/**
 * 类：外部比较器
 */
class BiJiao implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
//        return o1.getAge() - o2.getAge();
        return o1.getName().compareTo(o2.getName());
    }
}

/**
 * 类：学生
 */
class Student2 {
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
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
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}