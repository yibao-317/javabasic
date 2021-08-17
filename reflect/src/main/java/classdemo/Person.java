package classdemo;

/**
 * @author liyi
 * @create 2021 -08 -17 -11:39
 */
public class Person { // 类：用于反射
    private String name;
    public int age;

    public Person() {
        System.out.println("这是 Person 的空构造器");
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
}
