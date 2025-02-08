import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        Consumer<Integer> display = (value) -> System.out.println(value);

        display.accept(10);

        Consumer<List<Integer>> update = list ->
        {
            for(int i=0;i<list.size();i++){
                list.set(i, list.get(i)-5);
            }
        };

        Consumer<List<Integer>> disp = list -> list.stream().forEach(item -> System.out.print(item + " "));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(14);
        list.add(20);

        disp.accept(list);

        update.andThen(disp).accept(list);
    }
}
