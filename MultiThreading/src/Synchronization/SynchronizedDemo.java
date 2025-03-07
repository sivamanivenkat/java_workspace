package Synchronization;

public class SynchronizedDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread(dm, "Venkat");
        MyThread t2 = new MyThread(dm, "Siva");
        MyThread t3 = new MyThread(dm, "Mani");

        t1.start();
        t2.start();
        t3.start();
    }
}
