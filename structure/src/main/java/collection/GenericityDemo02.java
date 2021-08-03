package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyi
 * @create 2021 -08 -03 -15:28
 */
public class GenericityDemo02 { // 泛型上限、下限
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("aa", 11));
        list.add(new Person("bb", 12));
        list.add(new Person("cc", 13));

        List<Student> list2 = new ArrayList<Student>();
        list2.add(new Student("aa", "male"));
        list2.add(new Student("bb", "female"));
        list2.add(new Student("cc", "female"));

        // 如果Student也想调用此遍历方法，作为泛型类Student和Person是有上下级的
        bianLi(list2);
    }

    /*
    方法：遍历
     */
    public static void bianLi(List<? extends Person> list) {
        for (Person person : list) {
            System.out.println(person);
        }
    }
}

/**
 * 类：作为子类，继承自 Person
 */
class Student extends Person{
    private String name;
    private String sex;

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}


/**
 * 类：用作父类使用
 */
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
