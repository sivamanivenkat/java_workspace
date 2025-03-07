package Deadlocks;

public class FirstClass {

    public synchronized void method1(SecondClass sc){
        System.out.println("Inside method1 of FC");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Invoking method2 of SC from FC");
        sc.method2();
    }

    public synchronized void method2(){
        System.out.println("Inside method2 of FC");
    }
}
