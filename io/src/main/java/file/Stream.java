package file;

import java.io.*;

/**
 * @author liyi
 * @create 2021 -07 -05 -11:41
 */
public class Stream {  // 流相关
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\a.txt");
        File file2 = new File("E:\\b.txt");
        // 读取文件
//        fileInput(file);

        // 将信息放进文件中
//        fileOutput(file2);

        // 实现复制功能
//        copy(file1,file2);

        // 实现复制功能【字符流】
//        copyByCharacterStream(file1, file2);

        // 实现复制功能【缓冲字节流】
//        copyByBufferStream(file1,file2);

        // 实现复制功能【缓冲字符流】
//        copyBufferCharacterStream(file1, file2);

        // 实现复制功能【缓冲字符流】
        copyBufferCharacterStream2(file1, file2);
    }

    /**
     * 方法：实现复制功能【缓冲字符流】  --->> 效率更高
     *
     * @param file1
     * @param file2
     */
    private static void copyBufferCharacterStream2(File file1, File file2) throws IOException {
        FileReader fr = new FileReader(file1);
        FileWriter fw = new FileWriter(file2);
        // 缓冲流【字节流】
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        // 开始操作
        String string = br.readLine();
        while (null != string) {
            bw.write(string);
            // 每输入一行就跳行
            bw.newLine();
            string = br.readLine();
        }

        // 关闭流
        bw.close();
        br.close();
        fw.close();
        fr.close();
    }

    /**
     * 方法：实现复制功能【缓冲字符流】
     *
     * @param file1
     * @param file2
     */
    private static void copyBufferCharacterStream(File file1, File file2) throws IOException {
        FileReader fr = new FileReader(file1);
        FileWriter fw = new FileWriter(file2);
        // 缓冲流【字节流】
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        // 开始操作
        char[] chars = new char[1024];
        int len = br.read(chars);
        while (-1 != len) {
            bw.write(chars, 0, len);
            len = br.read(chars);
        }
        // 关闭流
        bw.close();
        br.close();
        fw.close();
        fr.close();

    }


    /**
     * 方法：实现复制功能【缓冲字节流】  --->>> 效率更高
     *
     * @param file1 源文件
     * @param file2 目标文件
     */
    private static void copyByBufferStream(File file1, File file2) throws IOException {
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        // 使用缓冲流
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        // 开始操作
        long startTime = System.currentTimeMillis();  // 记录时间
        byte[] bytes = new byte[1024];
        int len = bis.read(bytes);
        while (-1 != len) {
            bos.write(bytes, 0, len);
            len = bis.read(bytes);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("操作时间为：  " + (endTime - startTime) + " ms");
        // 关闭流【关闭高级流即可，但一般从代码角度上，还是都关闭更易理解】
        bos.close();
        bis.close();
        fos.close();
        fis.close();

    }

    /**
     * 方法：复制【字符流】
     *
     * @param file1 源文件
     * @param file2 目标文件
     */
    private static void copyByCharacterStream(File file1, File file2) throws IOException {
        FileReader fr = new FileReader(file1);
        FileWriter fw = new FileWriter(file2);

        char[] chars = new char[1024]; // 注意：字符流是 char[]
        int len = fr.read(chars);
        while (-1 != len) {
            fw.write(chars, 0, len);
            len = fr.read(chars);
        }

        // 刷新
        fw.flush();  // [close中实现了此方法，可以不写这句]
        // 关闭流
        fw.close();
        fr.close();

    }


    /**
     * 方法：复制
     *
     * @param file1 源文件
     * @param file2 目标文件
     */
    private static void copy(File file1, File file2) throws IOException {
        // 1、将源文件内容读取出来
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        long startTime = System.currentTimeMillis();  // 记录时间
        byte[] bytes = new byte[1024];
        int len = fis.read(bytes);
        while (-1 != len) {
            // 边读，边写
            fos.write(bytes, 0, len);  // 通过长度控制，去除掉没有用的空间
            len = fis.read(bytes);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("操作时间为：  " + (endTime - startTime) + " ms");

        // 3、关闭流
        fos.close();
        fis.close();

    }

    /**
     * 方法：将信息放进文件中
     *
     * @param file
     */
    private static void fileOutput(File file) throws IOException {
        // 1、确定目标文件【使用传入的】
        // 2、创建流，将管道指向目标文件
        FileOutputStream fos = new FileOutputStream(file, true);  // 使用双参的方法，追加内容；空构造器，默认覆盖
        // 3、准备内容
        String string = "她叫，顾南一";
        byte[] bytes = string.getBytes();
        // 4、开始写入
        fos.write(bytes);
        // 5、关闭流
        fos.close();
    }


    /**
     * 方法：读取文件中的信息
     *
     * @param file
     */
    private static void fileInput(File file) throws IOException {
        // 1、确认文件【使用传入的】
        // 2、创建流，将管道指向源文件
        FileInputStream fis = new FileInputStream(file);
        // 3、开始读取
        byte[] bytes = new byte[1024];  // 定义一个缓冲数组，效率提升，不用一个一个的去读
        int n = fis.read(bytes);
        while (-1 != n) {
            System.out.println(n);
            for (int i = 0; i < n - 1; i++) {
                System.out.println(bytes[i]);
            }
            n = fis.read(bytes);
        }
        // 4、关闭流
        fis.close();
    }
}
