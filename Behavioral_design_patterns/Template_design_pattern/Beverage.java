package Behavioral_design_patterns.Template_design_pattern;

public abstract class Beverage {
    final void prepareReceipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater(){
        System.out.println("Boiling water...");
    }
    
    void pourInCup(){
        System.out.println("Pouring in cup...");
    }

    public abstract void brew();
    public abstract void addCondiments();
}
