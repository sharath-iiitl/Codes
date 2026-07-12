package Behavioral_design_patterns.Command_design_pattern.Concrete_Commands;

import Behavioral_design_patterns.Command_design_pattern.Command;
import Behavioral_design_patterns.Command_design_pattern.Core_classes.TV;

public class TurnOffCommand implements Command{
    private TV tv;
    public TurnOffCommand(TV tv){
        this.tv=tv;
    }
    @Override
    public void execute(){
        tv.turnOff();
    }
}
