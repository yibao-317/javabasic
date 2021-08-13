package tcp.practice;

import java.io.Serializable;

/**
 * @author liyi
 * @create 2021 -08 -13 -9:35
 */
public class Student implements Serializable {
    private String name;
    private String pwd;

    public Student() {
    }

    public Student(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
