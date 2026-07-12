package Behavioral_design_patterns.Command_design_pattern.Concrete_Commands;

import Behavioral_design_patterns.Command_design_pattern.Command;
import Behavioral_design_patterns.Command_design_pattern.Core_classes.TV;

public class TurnOnCommand implements Command{
    private TV tv;
    public TurnOnCommand(TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }
}
