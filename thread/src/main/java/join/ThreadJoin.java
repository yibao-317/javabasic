package join;

/**
 * @author liyi
 * @create 2021 -07 -14 -17:16
 */
public class ThreadJoin {  // join方法
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            if(i==5){
                // 创建子线程，并强制让子线程先进行完
                Join t = new Join();
                t.start();
                t.join();  // 必须先有start(),join()才生效
            }
            System.out.println(Thread.currentThread().getName()+"=======》》"+i);
        }
    }

    /**
     * 线程类：测试 join方法
     */
    static class Join extends Thread{
        // 构造器
        public Join() {
        }

        public Join(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.getName()+"-------"+i);
            }
        }
    }

}
