package Deadlocks;

public class DeadlockDemo implements Runnable{
    FirstClass fc = new FirstClass();
    SecondClass sc = new SecondClass();

    public DeadlockDemo(){
        new Thread(this).start();
        sc.method1(fc);
    }
    public static void main(String[] args) {
        new DeadlockDemo();
    }
    public void run(){
        fc.method1(sc);
    }
}
