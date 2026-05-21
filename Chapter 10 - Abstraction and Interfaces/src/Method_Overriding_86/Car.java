package Method_Overriding_86;

public class Car extends Vehicle {

    @Override
    protected void service() {
        super.service();
        System.out.println("Our car is also in service area ... ..");
    }
}
