import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>(List.of("Siva","Mani","Venkat","k","L"));
        names.add("Dd");
        names.add("Siva");

        for(String str : names){
            System.out.println(str);
        }

        names.remove("Dd");
        System.out.println();
        for(String str : names){
            System.out.println(str);
        }
        System.out.println(names.size());
        System.out.println(names.containsAll(List.of("Siva","Mani")));
        //System.out.println(names.get("Venkat"));
    }
}
