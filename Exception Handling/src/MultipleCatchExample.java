public class MultipleCatchExample {
    public static void main(String[] args) {
        String str = "Hii, My name is Venkat!!";
        try {
            int n = Integer.parseInt(str);
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

