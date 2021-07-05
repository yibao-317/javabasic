package file;

import java.io.*;

/**
 * @author liyi
 * @create 2021 -07 -05 -11:41
 */
public class Stream {  // 流相关
    public static void main(String[] args) throws IOException {
        File file1 = new File("F:\\1.file\\1.3.txt");
        File file2 = new File("F:\\1.file\\test.txt");
        // 读取文件
//        fileInput(file);

        // 将信息放进文件中
//        fileOutput(file2);

        // 实习复制功能
        copy(file1,file2);
    }


    /**
     * 方法：复制
     * @param file1  源文件
     * @param file2  目标文件
     */
    private static void copy(File file1, File file2) throws IOException {
        // 1、将源文件内容读取出来
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        byte[] bytes = new byte[5];
        int len = fis.read(bytes);
        while (-1!=len){
            // 边读，边写
            fos.write(bytes,0,len);  // 通过长度控制，去除掉没有用的空间
            len = fis.read(bytes);
        }

        // 3、关闭流
        fos.close();
        fis.close();

    }

    /**
     * 方法：将信息放进文件中
     * @param file
     */
    private static void fileOutput(File file) throws IOException {
        // 1、确定目标文件【使用传入的】
        // 2、创建流，将管道指向目标文件
        FileOutputStream fos = new FileOutputStream(file,true);  // 使用双参的方法，追加内容；空构造器，默认覆盖
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
        while (-1!=n){
            System.out.println(n);
            for (int i = 0; i < n - 1; i++) {
                System.out.println(bytes[i]);
            }
            n=fis.read(bytes);
        }
        // 4、关闭流
        fis.close();
    }
}
