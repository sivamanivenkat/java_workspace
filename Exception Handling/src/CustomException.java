class StringPointingToNullException extends Exception{
    public StringPointingToNullException(String m){
        super(m);
    }
}

public class CustomException {

    public static void FindLength(String s)
    throws StringPointingToNullException {
        if (s == null) {
            throw new StringPointingToNullException("Cannot find length of a String that has null value.");
        }
        System.out.println("Length of String : " + s.length());
    }

    public static void main(String args[]){
        String str = null;

        try{
            FindLength(str);
        }catch (StringPointingToNullException se){
            System.out.println(se);
        }

    }
}
