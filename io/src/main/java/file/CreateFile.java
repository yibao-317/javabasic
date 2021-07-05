package file;

import java.io.File;

/**
 * @author liyi
 * @create 2021 -06 -29 -11:10
 */
public class CreateFile {  // 创建 File 的方式
    public static void main(String[] args) {
        // 方式一： \\
        File file1 = new File("E:\\test.txt");
        System.out.println("---------- 1 ---------" + file1);
        // 方式二： /
        File file2 = new File("E:/test.txt");
        System.out.println("---------- 2 ---------" + file2);
        // 方式三：File.separator【根据当前系统，获取该系统的分隔符，此方式更为严谨 win/mac】
        File file3 = new File("E:" + File.separator + "test.txt");
        System.out.println("---------- 3 ---------" + file3);
    }


}
