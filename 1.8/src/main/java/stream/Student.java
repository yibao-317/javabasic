package stream;

import java.util.Objects;

/**
 * @author liyi
 * @create 2021 -08 -20 -18:04
 */
public class Student {
    private String name;
    private int age;
    private String sex;
    private double height;

    public Student() {
    }

    public Student(String name, int age, String sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.height, height) == 0 &&
                name.equals(student.name) &&
                sex.equals(student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, height);
    }
}
