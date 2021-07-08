package file;

import java.io.*;

/**
 * @author liyi
 * @create 2021 -07 -08 -23:39
 */
public class FileCopy {  // 文件夹复制
    public static void main(String[] args) throws IOException {
        // 调用方法，实现文件夹复制
        File srcFile = new File("F:\\Java书籍");
        File targetFile = new File("F:\\Java书籍2");
        copyDir(srcFile, targetFile);
    }


    /**
     * 方法：复制文件夹
     *
     * @param srcFile    源文件夹
     * @param targetFile 目标文件夹
     */
    public static void copyDir(File srcFile, File targetFile) throws IOException {
        if (!targetFile.exists()) {
            // 如果目标文件夹不存在，就创建
            targetFile.mkdir();
        }
        // 遍历文件夹
        File[] files = srcFile.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                // 是文件夹
                copyDir(new File(srcFile + "/" + f.getName()), new File(targetFile + "/" + f.getName()));
            } else if (f.isFile()) {
                // 是文件
                copyFile(new File(srcFile + "/" + f.getName()), new File(targetFile + "/" + f.getName()));
            } else {
                break;
            }
        }
    }

    /**
     * 方法：复制文件
     *
     * @param srcFile    源文件
     * @param targetFile 目标文件
     */
    public static void copyFile(File srcFile, File targetFile) throws IOException {
        // 由于有可能是文件、图片..等格式，所以使用"字符流"
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile));
        // 开始操作
        byte[] bytes = new byte[1024];
        int len = bis.read(bytes);
        while (-1 != len) {
            bos.write(bytes, 0, len);
            len = bis.read(bytes);
        }
        // 关闭流
        bos.close();
        bis.close();
    }
}
