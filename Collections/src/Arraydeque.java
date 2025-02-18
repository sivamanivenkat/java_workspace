import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeque {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();
        names.add("Mani");
        names.add("Venkat");

        names.addFirst("Siva");
        names.addLast("k");
        System.out.println(names);
        System.out.println(names.peekFirst());
        System.out.println(names.peekLast());
        System.out.println(names.removeFirst());
        System.out.println(names);

        names.add("Venkat");
        System.out.println(names);

        System.out.println(names.removeFirstOccurrence("Venkat"));
        System.out.println(names);
    }
}
