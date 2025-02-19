import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Siva");
        s.add("Mani");
        s.add("Venkat");
        s.add("K");

        Iterator<String> itr = s.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
