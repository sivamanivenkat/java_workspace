public class PriorityExample extends Thread{
    public static void main(String[] args) {
        PriorityExample pe1 = new PriorityExample();
        pe1.setName("pe1");
        pe1.setPriority(6);
        pe1.start();

        PriorityExample pe2 = new PriorityExample();
        pe2.setName("pe2");
        pe2.setPriority(7);
        pe2.start();
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
