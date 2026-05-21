package interface_84;

public class Eagle extends Bird{
    public void fly(){
        System.out.println("i am flying ... ... ");
    }
    static void main() {
      Eagle obj = new Eagle();
      obj.fly();
    }
}
