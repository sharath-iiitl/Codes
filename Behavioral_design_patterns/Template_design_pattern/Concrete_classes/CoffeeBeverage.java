package Behavioral_design_patterns.Template_design_pattern.Concrete_classes;

import Behavioral_design_patterns.Template_design_pattern.Beverage;

public class CoffeeBeverage extends Beverage{
    @Override
    public void brew(){
        System.out.println("Brewing coffee...");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding sugar and milk...");
    }
    
}
