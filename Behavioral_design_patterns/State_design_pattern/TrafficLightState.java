package Behavioral_design_patterns.State_design_pattern;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
