package ThreadCommunication;

public class MyThread extends Thread {
    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("run() method calculating....");
            for(int i=0;i<50;i++){
                total += i;
            }
            this.notify();
        }
    }
}
