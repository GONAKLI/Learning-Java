package TrafficSignal_102;

public class MainClass {
    static void main() throws InterruptedException{
        Signals obj1 = new Signals("yellow", 2000);
        Signals obj2 = new Signals("red", 2000);
        Signals obj3 = new Signals("green", 2000);
//        Thread p1 = new Thread(obj1);
//        Thread p2 = new Thread(obj2);
//        Thread p3 = new Thread(obj3);
        int i =1;
        while (true){
            switch (i){
                case 1 :
                    Thread p1 = new Thread(obj1);
                    p1.start();
                    p1.join();
                    break;
                case 2 :
                    Thread p2 = new Thread(obj2);
                    p2.start();
                    p2.join();
                    break;
                case 3 :
                    Thread p3 = new Thread(obj3);
                    p3.start();
                    p3.join();
                    break;
            }

            i++;
            if(i == 4){
                i = 1;
            }
        }



    }
}
