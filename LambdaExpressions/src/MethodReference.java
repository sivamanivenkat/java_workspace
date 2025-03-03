import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

class Count{
    public static int countvowels(String s){
        int count = 0;
        String vowels = "AEIOUaeiou";
        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }
}

public class MethodReference {
    public static void main(String[] args) {
        Function<String, Integer> countVowelsFunction = Count :: countvowels;
        System.out.println("Number of Vowels in given Word : " + countVowelsFunction.apply("Venkat"));

        List<String> list = new ArrayList<>();
        list.add("Siva");
        list.add("Mani");
        list.add("Venkat");
        list.add("Korlakunta");

        Collections.sort(list, String::compareTo);
        list.forEach(System.out::println);
    }
}
