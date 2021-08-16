package udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author liyi
 * @create 2021 -08 -16 -12:17
 */
public class Recevie { // 接收方
    public static void main(String[] args) {
        System.out.println("....接收方开启....");
        // 创建套接字，还是Socket
        DatagramSocket ds = null;
        Scanner sc = new Scanner(System.in);
        try {
            ds = new DatagramSocket(317);
            while (true) {
                // 接收数据
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                ds.receive(dp);
                // 处理接收到的数据
                String string = new String(dp.getData(), 0, dp.getLength()); // 只接收应有的长度
                System.out.println("接收【" + string + "】");
                if ("bye".equals(string)) {
                    break;
                }
                // 回复发送方数据
//            String string2 = "接收方已收到！";
                String string2 = sc.next();
                byte[] bytes2 = string2.getBytes();
                DatagramPacket dp2 = new DatagramPacket(bytes2, bytes2.length, InetAddress.getByName("192.168.232.1"), 8888);
                ds.send(dp2);
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
        }
    }
}
