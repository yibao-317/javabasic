import java.util.Scanner;

/**
 * @author liyi
 * @create 2021 -07 -23 -20:39
 */
public class HandingException {  // 处理异常
    public static void main(String[] args) throws Exception {
        try {
            System.out.print("请输入被除数：");
            Scanner sc1 = new Scanner(System.in);
            int i = sc1.nextInt();
            System.out.print("请输入除数：");
            Scanner sc2 = new Scanner(System.in);
            int j = sc2.nextInt();
            System.out.println("结果为：" + (i / j));
            // 当出现一下代码时，finally中的代码不会执行
            System.exit(0);  // 终止当前运行的虚拟机
        } catch (Exception e) {
            // 方式一：自定义语句
//            System.out.println("过程发生错误，请重新输入！");
            // 方式二：打印堆栈信息
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            /**
             *   方式三：向上抛出异常，谁调用谁处理
             *      注意：此方式会中断当前运行的程序
             */
            throw e;
        } finally {
            System.out.println("感谢使用！");  // 方式三不会打印这句话
        }


    }
}
