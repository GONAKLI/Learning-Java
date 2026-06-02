package SingleExecutor_103;

public class PrintCounting implements Runnable{

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            System.out.println("Count is : " + i);
        }
    }
}
