import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(List.of(24,56,54,78,98,45,70));
        nums.add(89);
        nums.add(107);
        nums.add(34);

        for(int i : nums){
            System.out.println(i);
        }

        System.out.println("----------------------");
//        nums.addFirst(45);
//        nums.offerFirst(34);
        nums.push(76);
        nums.sort(Comparator.naturalOrder());
        for(int i : nums){
            System.out.println(i);
        }

        System.out.println("----------------------");
        System.out.println(nums.peek());
        System.out.println(nums.peekLast());
        System.out.println(nums.poll());

        System.out.println(nums.isEmpty());

        System.out.println(nums.pop());
        System.out.println(nums.pollLast());

        nums.removeAll(List.of(24,34,107));
        for(int i : nums) {
            System.out.println(i);
        }

    }
}
