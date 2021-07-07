package file;

import java.io.*;

/**
 * @author liyi
 * @create 2021 -07 -07 -17:32
 */
public class Practice {
    public static void main(String[] args) throws IOException {
        // 1、将键盘输入的东西 --->> 输出到硬盘上的某个文件，用效率最高的方式
        inputToOutput();


    }


    /**
     * 方法：将键盘输入的东西 --->> 输出到硬盘上的某个文件，用效率最高的方式
     * 思路：字符流 + 缓冲 + readLine
     */
    private static void inputToOutput() throws IOException {
        // 1、确定目标文件
        File file = new File("E:/a.txt");
        // 创建流  --->> 转换流
        InputStream in = System.in; // 字节流
        InputStreamReader isr = new InputStreamReader(in); // 转换流 -->> 字符流

        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
        // 开始操作
        String string = br.readLine();
        while (null!=string){
            if("over".equals(string)){
                break;  // 如果输入到 over，表示停止
            }
            bw.write(string);
            bw.newLine();  // 换行
            string = br.readLine();
        }
        // 关闭流
        bw.close();
        br.close();
        isr.close();
        in.close();



    }
}
