package Synchronization;

public class DisplayMessage {
    public synchronized void displayHello(String name){
        for(int i=0;i<6;i++) {
            System.out.println("Hello " + name);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public synchronized void displayHii(String name){
        for(int i=0;i<6;i++) {
            System.out.println("Hii " + name);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public void displayName(String name){
        for(int i=0;i<6;i++) {
            System.out.println(name);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
