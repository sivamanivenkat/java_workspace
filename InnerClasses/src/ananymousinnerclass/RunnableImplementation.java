package ananymousinnerclass;

public class RunnableImplementation {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Implementation using Anonymous Inner Class!!");
            }
        });
        t.start();
    }
}
