package Daemon;

public class DeamonDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());

        MyThread mt = new MyThread();
        mt.setDaemon(true);
        System.out.println(mt.isDaemon());
        mt.start();
//        mt.setDaemon(true);
    }
}
