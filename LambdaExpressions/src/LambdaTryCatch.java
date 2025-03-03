public class LambdaTryCatch {
    public static void main(String[] args) {
        StringLength n = (s) ->{
            {
                try{
                   return s.length();
                }catch (NullPointerException e){
                    e.printStackTrace();
                }
                return -1;
            }
        };
        System.out.println(n.FindLength(null));
    }
}

interface StringLength{
    int FindLength(String s);
}
