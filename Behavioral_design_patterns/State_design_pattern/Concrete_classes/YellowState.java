package Behavioral_design_patterns.State_design_pattern.Concrete_classes;

import Behavioral_design_patterns.State_design_pattern.TrafficLightContext;
import Behavioral_design_patterns.State_design_pattern.TrafficLightState;

public class YellowState implements TrafficLightState{
    
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from Yellow to Red");
        context.setState(new RedState());
    }

    @Override
    public String getColor(){
        return "Yellow";
    }
}
