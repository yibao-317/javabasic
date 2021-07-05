package file;

import java.io.File;

/**
 * @author liyi
 * @create 2021 -07 -01 -11:51
 */
public class TraverseFolder {  // 遍历文件夹下的所有文件，并展示
    public static void main(String[] args) {
        File file = new File("F:\\1.file");
        // 调用递归遍历文件夹的方法【加入层级】
        traverse(file, 1);

    }


    /**
     * 递归遍历
     *
     * @param file
     */
    public static void traverse(File file, int level) {
        File[] files = file.listFiles();
        for (File f : files) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("-");
            }
            System.out.println(f.getName());
            if (f.isDirectory()) {
                // 如果是文件夹，继续执行该方法
                traverse(f, level + 1);
            }
        }
    }

}
