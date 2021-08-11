package tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author liyi
 * @create 2021 -08 -12 -0:45
 */
public class Client { // 客户端：用于发送消息
    public static void main(String[] args) throws IOException {
        // 创建套接字
        Socket socket = new Socket(InetAddress.getByName("192.168.232.1"), 317);
        // 获取 输出流
        OutputStream os = socket.getOutputStream();
        /*
            发送内容：普通 & 高级
         */
//        String string = "一纪浮白";
//        byte[] bytes = string.getBytes();
//        os.write(bytes);

        String string = "一纪浮白";
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF(string);

        // 关闭流
        dos.close();
        os.close();
        socket.close();

    }
}
