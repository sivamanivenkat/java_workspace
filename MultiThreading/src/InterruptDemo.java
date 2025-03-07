public class InterruptDemo extends Thread{
    public static void main(String[] args) {
        InterruptDemo id = new InterruptDemo();
        id.start();

        id.interrupt();

        System.out.println("End of Main Thread");
    }

    public void run(){
        try{
        for(int i=0;i<10;i++) {
            System.out.println("Child Thread!");
            Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted.");
        }
    }
}
