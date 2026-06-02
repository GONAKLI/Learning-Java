package FixedThreadPool_104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);
        int i=0;
        while(i<10){
            service.submit(new PrintCount());
            i++;
        }
        service.shutdown();

        if(!service.awaitTermination(6, TimeUnit.SECONDS)){
            service.shutdownNow();
            System.out.println("EMERGENCY Shutdown Occurs");
        }

    }
}
