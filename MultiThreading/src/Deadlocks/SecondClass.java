package Deadlocks;

public class SecondClass {
    public synchronized void method1(FirstClass fc){
        System.out.println("Inside method1 of SC");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Invoking method2 of FC from SC");
        fc.method2();

    }

    public synchronized void method2(){
        System.out.println("Inside method2 of SC");
    }
}
