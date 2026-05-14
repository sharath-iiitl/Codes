package Builder_design_pattern;

import Builder_design_pattern.Car.CarBuilder;

public class Main {
    public static void main(String[] args){
        CarBuilder builder = new Car.CarBuilder();
        Car car1 = builder.setColor("Pink")
                          .setEngine("V8")
                          .setSeats(10)
                          .setSunroof(false)
                          .setSystemnavigation(true)
                          .setWheels(6)
                          .Build();


        System.out.print(car1);
    }
}
