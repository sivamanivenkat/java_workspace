public class RunnableExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello, I am Venkat!!");
    }

    public static void main(String[] args) {
        RunnableExample re = new RunnableExample();
        Thread t = new Thread(re);
        t.start();
    }
}
