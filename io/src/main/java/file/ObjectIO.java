package file;

import java.io.*;

/**
 * @author liyi
 * @create 2021 -07 -08 -17:32
 */
public class ObjectIO {  // 对象流
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 对象流【输入】
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E:/a.txt")));
        Student stu = new Student("yangyang", 21, "123456");
        stu.setHabit("习惯1111");  // 静态属性
        oos.writeObject(stu);
        oos.close();

        // 对象流【输出】
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:/a.txt")));
        Student stu2 = (Student) ois.readObject();
        System.out.println(stu2);
        ois.close();

    }


    /**
     * 实体类：注意，必须要实现序列化
     */
    static class Student implements Serializable {

        private static final long serialVersionUID = 6286447620862093164L;  // 序列化

        private String name;
        private int age;
        static String habit;
        transient String pwd;

        public Student(String name, int age, String pwd) {
            this.name = name;
            this.age = age;
            this.pwd = pwd;
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

        public static String getHabit() {
            return habit;
        }

        public static void setHabit(String habit) {
            Student.habit = habit;
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
                    ", age=" + age +
                    ", pwd='" + pwd + '\'' +
                    ", habit='" + habit + '\'' +
                    '}';
        }
    }
}
