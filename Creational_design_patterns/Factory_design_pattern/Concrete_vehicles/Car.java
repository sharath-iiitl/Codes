package Factory_design_pattern.Concrete_vehicles;

import Factory_design_pattern.Vehicle;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    public void stop() {
        System.out.println("Car is stopping...");
    }
}