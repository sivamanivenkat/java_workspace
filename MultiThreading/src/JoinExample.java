import java.util.Scanner;

public class JoinExample extends Thread{

    static int n, sum = 0;
    public static void main(String[] args) throws InterruptedException {

        Thread currentThread = Thread.currentThread();
        System.out.println("The main thread name is : " + currentThread.getName());
        long start = System.currentTimeMillis();
        System.out.println("Sum of first n Numbers : ");
        System.out.println("Enter the value of N : ");
        Scanner sc = new Scanner(System.in);
        JoinExample.n = sc.nextInt();

        JoinExample je = new JoinExample();
        je.start();

        je.join();
        System.out.println(JoinExample.sum);

        long end = System.currentTimeMillis();
        System.out.println("Time taken for the thread to complete is " + (end - start)/1000 + " seconds.");
    }

    public void run() {

        Thread currentThread = Thread.currentThread();
        currentThread.setName("Printing sum of first n numbers");
        System.out.println("The run() thread name is : " + currentThread.getName());

        for (int i = 0; i <= n; i++) {
            JoinExample.sum += i;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}
