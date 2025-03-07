package ThreadGroups;

public class TGExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup tg =  new ThreadGroup("Parent");
        System.out.println(tg.getName());

        ThreadGroup c = new ThreadGroup(tg, "Child");
        System.out.println(c.getName());
        System.out.println(c.getParent().getName());

        Thread t1 = new Thread(c, "Thread1");
        System.out.println(t1.getName());
        c.setMaxPriority(4);
        Thread t2 = new Thread(c, "Thread1");
        System.out.println(t2.getName());
        System.out.println(t2.getThreadGroup().getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


    }
}
