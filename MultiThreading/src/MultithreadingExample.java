public class MultithreadingExample extends Thread {
    public static void main(String[] args) throws InterruptedException{
        MultithreadingExample me = new MultithreadingExample();
        me.start();

        for (int i = 0; i < 20; i++) {
            System.out.print("i : " + i + " ");
            try{
                Thread.sleep(500); //takes time for 500 msec after exiting the loop and executing run() method.

            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

        public void run(){
            for(int j=0;j<20;j++){
                System.out.print("j : "+ j + " ");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }

    }
}
