package Behavioral_design_patterns.Command_design_pattern.Core_classes;

public class TV {
    public void turnOn(){
        System.out.println("TV is ON");
    }
    public void turnOff(){
        System.out.println("TV is OFF");
    }
    public void changeChannel(int channel){
        System.out.println("Channel changed to "+channel);
    }
    public void adjustVolume(int volume){
        System.out.println("Channel changed to "+volume);
    }
}
