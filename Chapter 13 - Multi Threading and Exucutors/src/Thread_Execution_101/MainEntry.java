package Thread_Execution_101;

public class MainEntry {
    static void main() throws InterruptedException {
        PrintCounting obj1 = new PrintCounting('a');
        PrintCounting obj2 = new PrintCounting('b');
        PrintCounting obj3 = new PrintCounting('c');
        long start = System.currentTimeMillis();
        long end;
        System.out.printf("%s started at : %d \n" ,obj1.getName(), start );
        obj1.start();
        obj1.join();
        end = System.currentTimeMillis();
        System.out.printf("%s ended in: %d milliSeconds", obj1.getName(), (end-start));
        start = System.currentTimeMillis();

        System.out.printf("%s started at : %d \n" ,obj2.getName(), start );

        obj2.start();

        obj2.join();

        end = System.currentTimeMillis();
        System.out.printf("%s ended in: %d milliSeconds", obj2.getName(), (end-start));
        start = System.currentTimeMillis();

        System.out.printf("%s started at : %d \n" ,obj3.getName(), start );
        obj3.start();
        obj3.join();
        end = System.currentTimeMillis();
        System.out.printf("%s ended in: %d milliSeconds", obj3.getName(), (end-start));

        System.out.println("all Tasks completed");
    }
}
