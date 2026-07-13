package Behavioral_design_patterns.Template_design_pattern;

import Behavioral_design_patterns.Template_design_pattern.Concrete_classes.*;

public class BeverageTemplateDemo {
    public static void main(String[] args){
        Beverage tea=new TeaBeverage();
        Beverage coffee=new CoffeeBeverage();
        
        tea.prepareReceipe();
        coffee.prepareReceipe();
    }
}
