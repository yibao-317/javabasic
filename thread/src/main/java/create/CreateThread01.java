package create;

/**
 * @author liyi
 * @create 2021 -07 -09 -14:23
 */
public class CreateThread01 extends Thread {  // 创建线程的方式一：继承 Thread,具备多线程的能力

    // 有参构造器：用来命名线程
    public CreateThread01(String name) {
        super(name);
    }

    // 空构造器
    public CreateThread01() {
    }

    @Override
    public void run() {  // 重写 run方法【线程体】
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+"--->>> "+i);  //获取线程的名称
        }
    }
}
