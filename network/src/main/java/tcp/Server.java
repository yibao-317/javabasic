package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liyi
 * @create 2021 -08 -12 -1:02
 */
public class Server { // 服务端
    public static void main(String[] args) throws IOException {
        // 创建套接字
        ServerSocket ss = new ServerSocket(317);
        // 准备接收，阻塞方法
        Socket socket = ss.accept();
        // 获取输入流
        InputStream is = socket.getInputStream();
        // 读取内容
        DataInputStream dis = new DataInputStream(is);
        String string = dis.readUTF();
        System.out.println("服务端接收信息为：  " + string);
        // 关闭流
        dis.close();
        is.close();
        ss.close();
    }
}
