package CallableUseCase_105;


import java.util.concurrent.Callable;

public class FactorialByCallable implements Callable {

    private final int num;

    @Override
    public Integer call() throws Exception {
        Thread.sleep(4000);
       return  factorial(num);
    }

    public FactorialByCallable(int x){
        this.num = x;
    }

    public int factorial(int num){
        if(num == 0){
            return 1;
        }
        return  num * factorial(num-1);
    }
}
