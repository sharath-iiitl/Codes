package Behavioral_design_patterns.Template_design_pattern.Concrete_classes;

import Behavioral_design_patterns.Template_design_pattern.Beverage;

public class TeaBeverage extends Beverage{
    @Override
    public void brew(){
        System.out.println("Brewing tea...");
    }
    
    @Override
    public void addCondiments(){
        System.out.println("Adding lemon...");
    }
    
}
