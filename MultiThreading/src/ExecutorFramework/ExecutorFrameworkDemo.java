package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {
    public static void main(String[] args) {
        CheckProcessor[] cp = {new CheckProcessor("Bank"), new CheckProcessor("ATM"), new CheckProcessor("Mobile"),
        new CheckProcessor("Web")};

        ExecutorService es = Executors.newFixedThreadPool(3);

        for(CheckProcessor checkProcessor : cp){
            es.submit(checkProcessor);
        }

        es.shutdown();
    }
}
