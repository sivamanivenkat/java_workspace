import java.util.function.Supplier;

public class SupplierFunc {
    public static void main(String[] args) {
        Supplier<Double> a = () -> Math.random();
        System.out.println(a.get());
    }
}
