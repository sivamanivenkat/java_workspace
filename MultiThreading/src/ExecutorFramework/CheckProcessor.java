package ExecutorFramework;

public class CheckProcessor extends Thread {
    String name;

    public CheckProcessor(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + " Check Processor working...." + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " Check processing done!!" + Thread.currentThread().getName());
    }
}
