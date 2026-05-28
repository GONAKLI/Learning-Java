package Thread_Create_99;

class Print extends Thread {
    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            System.out.println("Hello from thread:  " + Thread.currentThread().getName());
        }
    }
}
