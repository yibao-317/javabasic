package classdemo;

/**
 * @author liyi
 * @create 2021 -08 -17 -11:40
 */
public class Student extends Person { // 类：用于反射
    private double height;
    char gender;
    protected int id;
    public String love;

    public Student() {
        System.out.println("这是 Student 的空构造器");
    }

    public Student(double height, char gender, int id, String love) {
        this.height = height;
        this.gender = gender;
        this.id = id;
        this.love = love;
    }

    private Student(String name, int age, double height, char gender, int id, String love) {
        super(name, age);
        this.height = height;
        this.gender = gender;
        this.id = id;
        this.love = love;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                ", gender=" + gender +
                ", id=" + id +
                ", love='" + love + '\'' +
                '}';
    }

    public void sleep() {
        System.out.println("这是 Student 的 sleep 方法 --- public");
    }

    private void car() {
        System.out.println("这是 Student 的 car 方法 --- private");
    }

    public int say(int a) {
        System.out.println("这是 Student 的 say 方法，有返回值，int");
        return 1;
    }
}
