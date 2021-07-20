package group;

/**
 * @author liyi
 * @create 2021 -07 -20 -9:57
 */
public class ThreadGroupDemo {  // 线程组相关
    public static void main(String[] args) {
        // 当前线程
//        Thread thread = Thread.currentThread();
//        System.out.println(thread);  // Thread[main,5,main]
//        System.out.println(thread.getThreadGroup().getName()); // main
//        System.out.println(thread.getThreadGroup().getParent().getName()); // system
//        System.out.println(thread.getThreadGroup().getParent().getParent()); // null

        // 通过上方输出得出： main ---> system【顶层线程组】  👆👆👆



        /*
         *  查看组里有哪些线程
                java.lang.ThreadGroup[name=main,maxpri=10]
                Thread[main,5,main]   ---->>>>  【线程名称，线程优先级别(默认是5)，线程从属哪个组】
                Thread[Monitor Ctrl-Break,5,main]  ---->>> 【注意：这是IDEA & 使用run方式执行 特有的线程】
         */
//        thread.getThreadGroup().list();



        // 自定义线程组,并放入线程
        ThreadGroup threadGroup = new ThreadGroup("自定义线程组");
        Thread t1 = new Thread(threadGroup, "线程A");
        Thread t2 = new Thread(threadGroup, "线程B");
        t1.start();  // 在执行 start方法 的时候，线程才真正的加入线程组
        t2.start();
        threadGroup.list();

        // 可以对整个线程组进行设置
//        threadGroup.setDaemon(true);
//        threadGroup.setMaxPriority(10);

    }
}
