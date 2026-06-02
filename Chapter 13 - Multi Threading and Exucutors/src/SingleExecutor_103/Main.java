package SingleExecutor_103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static void main() {
        PrintCounting obj = new PrintCounting();
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(obj);
        service.shutdown();
    }
}
