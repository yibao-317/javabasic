package consreference;

/**
 * @author liyi
 * @create 2021 -08 -20 -14:07
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("调用无参构造器");
    }

    public Student(String name, int age) {
        System.out.println("调用有参构造器");
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
