package tcp.practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liyi
 * @create 2021 -08 -12 -23:25
 */
public class Server02 {
    public static void main(String[] args) throws IOException {
        // 自己作为客户端，上传一张图片给服务端（自己），服务端返回 "上传成功"

        // 创建套接字
        ServerSocket ss = new ServerSocket(317);
        // 准备接受，阻塞方法
        Socket socket = ss.accept();
        // 获取输入流
        InputStream is = socket.getInputStream();
        // 获取输入信息，将其写入别的中
        FileOutputStream fos = new FileOutputStream("F:\\壁纸\\317.jpg");
        // 提升速度，使用缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = new byte[1024];
        int n = is.read(bytes);
        while (-1 != n) {
            bos.write(bytes, 0, n);
            n = is.read(bytes);
        }

        // 关闭输入流，切换输入流，返回一个信息给客户端
        socket.shutdownInput();
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("上传成功！");

        // 关闭流
        dos.close();
        os.close();
        bos.close();
        fos.close();
        is.close();
        socket.close();
        ss.close();

    }
}
