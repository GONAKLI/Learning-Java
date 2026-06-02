package FixedThreadPool_104;

public class PrintCount implements Runnable{
    @Override
    public void run() {

        try{
            System.out.println("Thread Started: " + Thread.currentThread().getName() );
            int Time = (int) (Math.ceil(Math.random()*5)) * 1000;
//            System.out.println("time is: " + Time);
            Thread.sleep(Time);
            System.out.println("Thread Ended: " + Thread.currentThread().getName() );
        } catch (InterruptedException e) {
            System.out.println("exception occured in thread: " + e.getMessage() );
        }

    }
}
