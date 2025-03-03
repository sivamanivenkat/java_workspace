import java.util.Locale;

public class Lambda {
    public static void main(String[] args) {
        Hello hello = (s) -> System.out.println(s);
        hello.greet("Hello, I am Venkat!!");

        StringCompare b = (s1,s2) ->{
            if(s1.length()>s2.length()){
                return s1;
            }
            return s2;
        };
        System.out.println("Longer of 2 Strings : " + b.compare("Siva","Venkat"));

    }
}
@FunctionalInterface
interface Hello{
    void greet(String s);
}

@FunctionalInterface
interface StringCompare{
    String compare(String s1, String s2);
}
