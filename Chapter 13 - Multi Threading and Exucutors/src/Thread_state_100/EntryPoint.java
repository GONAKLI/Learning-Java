package Thread_state_100;

public class EntryPoint  {
    static void main() throws InterruptedException {
        ThreadClass t1 = new ThreadClass();
        Thread p1 = new Thread(t1);
        System.out.println("State of thread is : " + p1.getState());
        p1.start();

        System.out.println("State of thread is : " + p1.getState());

        p1.join();

        System.out.println("state of thread is: " + p1.getState());
    }
}
