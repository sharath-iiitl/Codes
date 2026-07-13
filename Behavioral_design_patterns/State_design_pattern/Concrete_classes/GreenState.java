package Behavioral_design_patterns.State_design_pattern.Concrete_classes;

import Behavioral_design_patterns.State_design_pattern.TrafficLightContext;
import Behavioral_design_patterns.State_design_pattern.TrafficLightState;

public class GreenState implements TrafficLightState{
    
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from Green to Yellow");
        context.setState(new YellowState());
    }

    @Override
    public String getColor(){
        return "Green";
    }
}
