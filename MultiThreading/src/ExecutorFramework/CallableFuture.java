package ExecutorFramework;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {
    public static void main(String[] args) {
        CallableTest[] ct = {new CallableTest(10), new CallableTest(20), new CallableTest(30)};

        ExecutorService es = Executors.newFixedThreadPool(3);

        for(CallableTest callableTest : ct){
            Future<Integer> future = es.submit(callableTest);

            try{
                System.out.println(future.get());
            }catch (Exception e){
                System.out.println(e);
            }
        }
        es.shutdown();
    }
}
