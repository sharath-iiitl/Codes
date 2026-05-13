package Abstract_factory_pattern.Concrete_Cars;

import Abstract_factory_pattern.Interfacess.Vehicle;

public class BMW implements Vehicle{
    public void start(){
        System.out.println("Toyota car started...");
    }
    public void stop(){
        System.out.println("Toyota car stoped...");
    }
}