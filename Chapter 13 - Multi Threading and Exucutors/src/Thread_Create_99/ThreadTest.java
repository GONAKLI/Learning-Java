package Thread_Create_99;

public class ThreadTest {
    static void main() {
        Print p1 = new Print();
        p1.setName("lucky");
        Print p2 = new Print();
        p2.setName("Vijay");

        System.out.println( Thread.currentThread());
        p1.start();
        p2.start();

    }
}
