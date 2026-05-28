package Thread_Execution_101;

public class PrintCounting extends Thread{
    private final char symbol;
    @Override
    public void run() {

        for(int i =0; i<10; i++){
            System.out.println("Value of i is: " + i + " " + symbol);
        }
        System.out.println("Thread completed: " + symbol);
    }

    PrintCounting(char symbol){
        this.symbol = symbol;
    }
}
