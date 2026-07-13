package Behavioral_design_patterns.State_design_pattern;

import Behavioral_design_patterns.State_design_pattern.Concrete_classes.RedState;

public class TrafficLightContext {
    private TrafficLightState currentState;
    public TrafficLightContext(){
        currentState=new RedState();
    }
    public void setState(TrafficLightState state){
        this.currentState=state;
    }
    public void next(){
        currentState.next(this);
    }
    public String getColor(){
        return currentState.getColor();
    }
}
