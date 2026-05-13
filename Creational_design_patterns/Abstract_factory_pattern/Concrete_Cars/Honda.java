package Abstract_factory_pattern.Concrete_Cars;

import Abstract_factory_pattern.Interfacess.Vehicle;

public class Honda implements Vehicle{
    public void start(){
        System.out.println("Honda car started...");
    }
    public void stop(){
        System.out.println("Honda car stoped...");
    }
}