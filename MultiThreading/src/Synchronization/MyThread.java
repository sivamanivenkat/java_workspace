package Synchronization;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;

    public MyThread(DisplayMessage dm, String name){
        this.dm = dm;
        this.name = name;
    }
    public void run(){
        dm.displayHello(name);
        dm.displayHii(name);
        dm.displayName(name);
    }
}
