package lifecycle;

/**
 * @author liyi
 * @create 2021 -07 -14 -16:59
 */
public class Priority {   // 优先级别设置
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setPriority(10);  // 设置优先级 -->> 只是被CPU调度的概率高了，并不是一定先被调度,不设置都是5
        rabbit.start();
        Tortoise tortoise = new Tortoise();
        tortoise.setPriority(1);
        tortoise.start();
    }

    /**
     * 兔子类
     */
    static class Rabbit extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("兔子，这是第"+i+"出现");
            }
        }
    }

    /**
     * 乌龟类
     */
    static class Tortoise extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("乌龟，这是第"+i+"出现");
            }
        }
    }
}
