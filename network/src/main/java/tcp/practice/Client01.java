package tcp.practice;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author liyi
 * @create 2021 -08 -12 -23:15
 */
public class Client01 {
    public static void main(String[] args) throws IOException {
        // 自己作为客户端，上传一张图片给服务端（自己），服务端返回 "上传成功"

        // 创建套接字
        Socket socket = new Socket(InetAddress.getByName("192.168.232.1"), 317);
        // 获取输出流
        OutputStream os = socket.getOutputStream();
        // 输出 【图片】
        FileInputStream fis = new FileInputStream(new File("F:\\壁纸\\9.jpg"));
        int n = fis.read();
        while (-1 != n) {
            os.write(n);
            n = fis.read();
        }

        // 关闭输出流，切换输入流，接收来自服务端的返回信息
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String read = dis.readUTF();
        System.out.println(read);

        // 关闭流
        dis.close();
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}
