package Behavioral_design_patterns.Command_design_pattern.Concrete_Commands;

import Behavioral_design_patterns.Command_design_pattern.Command;
import Behavioral_design_patterns.Command_design_pattern.Core_classes.TV;

public class AdjustVolumeCommand implements Command{
    private TV tv;
    private int volume;
    public AdjustVolumeCommand(TV tv,int volume){
        this.tv=tv;
        this.volume=volume;
    }

    @Override
    public void execute(){
        tv.adjustVolume(volume);
    }
}
