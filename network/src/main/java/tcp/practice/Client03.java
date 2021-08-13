package tcp.practice;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author liyi
 * @create 2021 -08 -12 -23:15
 */
public class Client03 {
    public static void main(String[] args) throws IOException {
        // 实现登录操作的双向通信，结合对象流

        // 创建套接字
        Socket socket = new Socket("192.168.232.1", 317);
        // 输入账号密码，封装对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String pwd = scanner.next();
        Student student = new Student(name, pwd);
        // 获取流，封装对象流
        OutputStream os = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(student);
        // 切流，获取服务端返回信息
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        boolean flag = dis.readBoolean();
        if (flag) {
            System.out.println("登录成功！");
        } else {
            System.out.println("账号或密码错误！");
        }
        // 关闭流
        dis.close();
        is.close();
        oos.close();
        os.close();
        scanner.close();
        socket.close();
    }
}
