import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.function.Predicate;

public class PredicateFunction {
    public static void main(String[] args) {

        Predicate<Integer> lessThan = (value) -> value < 10;

        Predicate<Integer> greaterThan = (value) -> value > 5;

        boolean res = lessThan.or(greaterThan).test(18);
        boolean res2 = lessThan.and(greaterThan).test(18);
        System.out.println(res);
        System.out.println(res2);

        boolean res3 = lessThan.and(greaterThan).negate().test(18);

        System.out.println("After negation...");
        System.out.println(res3);
    }

}
