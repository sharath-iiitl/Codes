package Abstract_factory_pattern.Concrete_Factories;

import Abstract_factory_pattern.Interfacess.VehicleFactory;
import Abstract_factory_pattern.Concrete_Cars.BMW;
import Abstract_factory_pattern.Interfacess.Vehicle;

public class BMWFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new BMW();
    }
}