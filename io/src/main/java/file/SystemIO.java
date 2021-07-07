package file;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

/**
 * @author liyi
 * @create 2021 -07 -07 -17:02
 */
public class SystemIO {  // system  <<--->> io
    public static void main(String[] args) throws IOException {
        // System.in 其实是一个流  --->>> new Scanner(System.in);
        InputStream in = System.in;
        int len = in.read();

        // System.out 会失去原本的数据类型，均变为 String  --->> System.out.println();
        PrintStream out = System.out;
        out.print(545);
        out.print(new Date());
        out.print(3.5);

        // 扫描硬盘上的一个文件
        Scanner scanner = new Scanner(new FileInputStream(new File("E:/a.txt")));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
