package Abstract_factory_pattern;

import Abstract_factory_pattern.Interfacess.Vehicle;
import Abstract_factory_pattern.Interfacess.VehicleFactory;
import Abstract_factory_pattern.Concrete_Factories.BMWFactory;


public class Main{
    public static void main(String[] args){
        VehicleFactory bmwfactory = new BMWFactory();
        Vehicle bmwcar = bmwfactory.createVehicle();
        bmwcar.start();
        bmwcar.stop();
    }
}