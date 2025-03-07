package Assignment;

public class Main{
    public static void main(String[] args) {
        EvenNumbersThread et = new EvenNumbersThread();
        OddNumbersThread ot = new OddNumbersThread();

        et.start();
        ot.start();
    }
}
