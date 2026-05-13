package Abstract_factory_pattern.Concrete_Factories;

import Abstract_factory_pattern.Interfacess.VehicleFactory;
import Abstract_factory_pattern.Concrete_Cars.Toyota;
import Abstract_factory_pattern.Interfacess.Vehicle;

public class ToyotaFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Toyota();
    }
}