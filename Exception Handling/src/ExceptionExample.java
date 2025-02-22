import java.util.Locale;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try{
            int n = arr[3];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        int a = 10;
        int b = 0;
        try{
            int k = a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        String str = "Venkat";
        try{
            int i = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println(e);
        }

        String s = null;
        try{
            String s2 = s.toLowerCase();
        }catch (NullPointerException e){
            System.out.println(e);
        }

        finally {
            System.out.println("Code inside finally block!!");
        }

        System.out.println("After all the Exceptions!!");
    }
}
