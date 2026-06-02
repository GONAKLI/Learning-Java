package CallableUseCase_105;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static void main() throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);
        System.out.print("Enter a number to find a factorial: ");
        int number = new Scanner(System.in).nextInt();
       Future<Integer> result = service.submit(new FactorialByCallable(number));
        System.out.println(result.get());

        service.shutdown();
    }
}
