package Builder_design_pattern;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean systemNavigation;
    private Car(CarBuilder builder){
        this.engine=builder.engine;
        this.wheels=builder.wheels;
        this.seats=builder.seats;
        this.color=builder.color;
        this.sunroof=builder.sunroof;
        this.systemNavigation=builder.systemNavigation;
    }

    public String getEngine(){
        return this.engine;
    }

    public int getWheels(){
        return this.wheels;
    }
    
    public int getSeats(){
        return this.seats;
    }

    public String getColor(){
        return this.color;
    }

    public boolean getSunroof(){
        return this.sunroof;
    }

    public boolean getSystemNavigation(){
        return this.systemNavigation;
    }

    @Override
    public String toString(){
        return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats
                + ", color=" + color + ", sunroof=" + sunroof
                + ", navigationSystem=" + systemNavigation + "]";
    }

    public static class CarBuilder{
        private String engine;
        private int wheels=4;
        private int seats=4;
        private String color="Black";
        private boolean sunroof=false;
        private boolean systemNavigation=true;

        public CarBuilder setEngine(String engine){
            this.engine=engine;
            return this;
        }

        public CarBuilder setWheels(int wheels){
            this.wheels=wheels;
            return this;
        }

        public CarBuilder setSeats(int seats){
            this.seats=seats;
            return this;
        }

        public CarBuilder setColor(String color){
            this.color=color;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof){
            this.sunroof=sunroof;
            return this;
        }

        public CarBuilder setSystemnavigation(boolean systemNavigation){
            this.systemNavigation=systemNavigation;
            return this;
        }

        public Car Build(){
            return new Car(this);
        }
    }
}
