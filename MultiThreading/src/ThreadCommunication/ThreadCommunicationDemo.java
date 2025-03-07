package ThreadCommunication;

public class ThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();

        synchronized (t){
            System.out.println("Main method wait for run method to Complete.");
            t.wait();
            System.out.println("Main method notified!!");
            System.out.println(t.total);
        }
    }
}
