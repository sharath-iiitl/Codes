package Behavioral_design_patterns.State_design_pattern;

public class TrafficeLightTest {
    public static void main(String[] args){
        TrafficLightContext context=new TrafficLightContext();
        context.next();
        context.next();
        context.next();
    }
}
