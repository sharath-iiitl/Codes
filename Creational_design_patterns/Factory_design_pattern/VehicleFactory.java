package Factory_design_pattern;

import Factory_design_pattern.Concrete_vehicles.*;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equals("Car")){
            return new Car();
        }
        else if(vehicleType.equals("Bike")){
            return new Bike();
        }
        else if(vehicleType.equals("Truck")){
            return new Truck();
        }
        else{
            throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }
}