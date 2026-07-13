package Behavioral_design_patterns.State_design_pattern.Concrete_classes;

import Behavioral_design_patterns.State_design_pattern.TrafficLightContext;
import Behavioral_design_patterns.State_design_pattern.TrafficLightState;

public class RedState implements TrafficLightState{
    
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from Red to Green");
        context.setState(new GreenState());
    }

    @Override
    public String getColor(){
        return "Red";
    }
}
