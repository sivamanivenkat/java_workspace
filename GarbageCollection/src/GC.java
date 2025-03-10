import java.lang.ref.Cleaner;

public class GC {
    private static final Cleaner cleaner = Cleaner.create();
    private final Cleaner.Cleanable cleanable;

    GC() {
        System.out.println(this + " created!");


        cleanable = cleaner.register(this, () -> System.out.println(this + " cleaned.."));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new GC();
        }

        System.gc();
    }
}
