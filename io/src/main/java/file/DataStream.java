package file;

import java.io.*;

/**
 * @author liyi
 * @create 2021 -07 -07 -22:37
 */
public class DataStream {  // 数据流
    public static void main(String[] args) throws IOException {
        // 数据流：写数据
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("E:/b.txt")));
        dos.writeBoolean(false);
        dos.writeDouble(3.17);
        dos.writeUTF("abc");  // String 类型
        // 关闭流
        dos.close();

        // 数据流：读数据
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("E:/b.txt")));
        // 【按写的顺序读】
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        // 关闭流
        dis.close();


    }
}
