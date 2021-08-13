package tcp.practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liyi
 * @create 2021 -08 -12 -23:25
 */
public class Server03 {
    public static void main(String[] args) throws IOException {
        // 实现登录操作的双向通信，结合对象流

        // 创建套接字
        ServerSocket ss = new ServerSocket(317);
        // 准备接收，阻塞方法
        Socket socket = null;

        // 服务端不间断，一直启动
        while (true) {
            // 阻塞，来一个处理一个
            socket = ss.accept();
            new ServerSocketThread(socket).start();   // 启动线程
        }

    }
}
