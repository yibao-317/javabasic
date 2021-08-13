package tcp.practice;

import java.io.*;
import java.net.Socket;

/**
 * @author liyi
 * @create 2021 -08 -14 -0:10
 */
public class ServerSocketThread extends Thread { // 服务端线程
    Socket socket = null;

    public ServerSocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 获取输入流，拿到封装对象
        InputStream is = null;
        ObjectInputStream ois = null;
        Student student = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        try {
            is = socket.getInputStream();
            ois = new ObjectInputStream(is);
            student = (Student) ois.readObject();
//        System.out.println(student);
            // 判断账号密码正确与否
            boolean flag = false;
            if ("nanyi".equals(student.getName()) && "123".equals(student.getPwd())) {
                flag = true;
            }
            // 切流，将标志位返回
            socket.shutdownInput();
            os = socket.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeBoolean(flag);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 关闭流
        try {
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
