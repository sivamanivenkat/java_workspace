import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Siva");
        list.add("Mani");
        list.add("Venkat");
        list.add("Akhila");
        list.add("Narayanan");
        list.add("Vikranth");

        List res = list.stream().
                filter(s->s.contains("k")).
                map(String::toLowerCase).
                sorted().
                collect(Collectors.toList());

        res.forEach(System.out::println);

    }
}
