package Behavioral_design_patterns.Command_design_pattern.Core_classes;

import Behavioral_design_patterns.Command_design_pattern.Command;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    public void setOnCommand(Command onCommand){
        this.onCommand=onCommand;
    }
    public void setOffCommand(Command offCommand){
        this.offCommand=offCommand;
    }
    public void pressOnButton(){
        onCommand.execute();
    }
    public void pressOffButton(){
        offCommand.execute();
    }
}
