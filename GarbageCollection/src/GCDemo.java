public class GCDemo implements AutoCloseable {
    int objId;

    GCDemo(int objId) {
        this.objId = objId;
        System.out.println(this.objId + " created");
    }

    @Override
    public void close() {
        System.out.println(objId + " cleaned");
    }

    public static void main(String[] args) {
        try (GCDemo obj = new GCDemo(1)) {
            System.out.println("Using object...");
        }
    }
}
