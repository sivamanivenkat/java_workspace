package Assignment;

public class OddNumbersThread extends Thread{
    public synchronized void run(){
        for(int i=1;i<=10;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
