package udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author liyi
 * @create 2021 -08 -16 -12:06
 */
public class Send { // UDP模拟聊天室：发送方
    public static void main(String[] args) {
        System.out.println("....发送方开启....");
        // 创建套接字 【注意：8888 指的是发送方的端口号，也可以使用无参构造，此处是为了实现聊天过程中接收 接收方发回来的消息】
        DatagramSocket ds = null;
        Scanner sc = new Scanner(System.in);
        try {
            ds = new DatagramSocket(8888);
            while (true) {
                // 内容
//            String string = "你好";
                String string = sc.next();
                byte[] bytes = string.getBytes();
                // 发送
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.232.1"), 317);
                ds.send(dp);
                if ("bye".equals(string)) {
                    break;
                }
                // 接收返回数据
                byte[] bytes2 = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(bytes2, bytes2.length);
                ds.receive(dp2);
                // 处理接收的数据
                String string2 = new String(dp2.getData(), 0, dp2.getLength());
                System.out.println("返回数据" + string2);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            ds.close();
            sc.close();
        }
    }
}
