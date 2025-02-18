import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1234, "Venkat");
        student.put(1235, "Siva");
        student.put(1236, "Mani");
        student.putIfAbsent(1237, "Akhila");
        student.putIfAbsent(1235, "A");

        System.out.println(student);
        System.out.println(student.get(1234));
        System.out.println(student.containsKey(1234));
        System.out.println(student.containsValue("Venkat"));
        System.out.println(student.size());
        System.out.println(student.remove(1235));
        System.out.println(student);

        System.out.println(student.isEmpty());
    }
}
