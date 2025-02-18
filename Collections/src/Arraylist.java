import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Siva");
        names.add("Mani");
        names.add("Venkat");

        for(String name : names){
            System.out.println(name);
        }

        names.add(0, "Korlakunta");
        for(String name : names){
            System.out.println(name);
        }

        names.set(0,"k");
        for(String name : names){
            System.out.println(name);
        }

        System.out.println(names.get(3));

        System.out.println(names.contains("Siva"));

        System.out.println(names.containsAll(List.of("Siva", "Venkat")));

        names.retainAll(List.of("Siva","Venkat"));
        for(String name : names){
            System.out.println(name);
        }

        names.sort(Comparator.naturalOrder());
        for(String name : names){
            System.out.println(name);
        }

        names.sort(Comparator.reverseOrder());
        for(String name : names){
            System.out.println(name);
        }

        List<Integer> nums = new ArrayList<>(List.of(120,140,187,250,120,904));

        nums.add(nums.size());
        for(int i : nums){
            System.out.println(i);
        }

        System.out.println(nums.indexOf(188));
        System.out.println(nums.lastIndexOf(120));
    }
}
