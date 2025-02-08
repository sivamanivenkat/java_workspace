import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply = val -> val*2;
        System.out.println(multiply.apply(10));

        Function<Integer, Integer> sub = val -> val - 5;
        System.out.println(multiply.andThen(sub).apply(10));

        System.out.println(multiply.compose(sub).apply(10));


    }
}
