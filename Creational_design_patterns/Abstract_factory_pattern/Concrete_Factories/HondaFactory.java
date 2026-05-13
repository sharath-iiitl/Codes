package Abstract_factory_pattern.Concrete_Factories;

import Abstract_factory_pattern.Interfacess.VehicleFactory;
import Abstract_factory_pattern.Concrete_Cars.Honda;
import Abstract_factory_pattern.Interfacess.Vehicle;

public class HondaFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Honda();
    }
}