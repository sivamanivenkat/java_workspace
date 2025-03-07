package ThreadGroups;

public class TGMethods {
    public static void main(String[] args) {
        ThreadGroup tgm = new ThreadGroup("MyThreadGroup");

        ThreadGroup c1 = new ThreadGroup(tgm, "Child1");
        ThreadGroup c2 = new ThreadGroup(tgm, "Child2");
        ThreadGroup c3 = new ThreadGroup(tgm, "Child3");

        Thread thread1 = new Thread(c1,"Thread1");
        Thread thread2 = new Thread(c2,"Thread1");
        Thread thread3 = new Thread(c3,"Thread1");

        ThreadGroup c4 = new ThreadGroup(c1, "Child1_4");
        Thread thread4 = new Thread(c4,"Thread1");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        System.out.println(tgm.activeGroupCount());
        System.out.println(c1.activeGroupCount());
        System.out.println(c4.getParent().getName());
        System.out.println(c4.getParent().getParent().getName());

        System.out.println(c1.activeCount());

        c1.list();
        tgm.list();

    }
}
