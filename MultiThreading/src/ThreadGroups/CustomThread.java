package ThreadGroups;

public class CustomThread extends Thread{

    public CustomThread(ThreadGroup tg, String name){
        super(tg,name);
    }

    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
