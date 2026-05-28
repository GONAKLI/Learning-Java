package TrafficSignal_102;

public class Signals implements Runnable {
    private final long time;
    private final String signal;
    @Override
    public synchronized void run(){
      try{
          if(this.signal.equals("red") ){
              System.out.println("Signal RED --> Stop, dont cross the line, ");
              Thread.sleep(this.time);
          } else if (this.signal.equals("yellow") ) {
              System.out.println("Signal YELLOW --> Attention!, please slow down, Signal will be RED soon");
              Thread.sleep(this.time);
          } else if (this.signal.equals("green") ) {
              System.out.println("Signal GREEN --> go freely, happy journey .. ");
              Thread.sleep(this.time);
          }
      }catch (InterruptedException e){
          System.out.println("Exception occurred in the system");
      }
    }
    public Signals(String signal, long time){
        this.signal = signal;
        this.time = time;
    }
}
