package create;

/**
 * @author liyi
 * @create 2021 -07 -09 -17:40
 */
public class GameTest {  // 线程模拟练习
    public static void main(String[] args) {
        ThreadA a = new ThreadA("A");
        ThreadB b = new ThreadB("B");

        a.start();
        b.start();

    }

    /**
     * 线程 A
     */
    static class ThreadA extends Thread{
        public ThreadA() {
        }

        public ThreadA(String name) {
            super(name);
        }

        @Override
        public void run() {
            int i = 0;
            while (i<10){
                i++;
                try {
                    sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName());
            }
        }
    }

    /**
     * 线程 B
     */
    static class ThreadB extends Thread{
        public ThreadB() {
        }

        public ThreadB(String name) {
            super(name);
        }

        @Override
        public void run() {
            int j = 0 ;
            while(j<10){
                j++;
                try {
                    sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName());
            }
        }
    }
}
