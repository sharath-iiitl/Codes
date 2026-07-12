package Behavioral_design_patterns.Command_design_pattern.Concrete_Commands;

import Behavioral_design_patterns.Command_design_pattern.Command;
import Behavioral_design_patterns.Command_design_pattern.Core_classes.TV;

public class ChangeChannelCommand implements Command{
    private TV tv;
    private int channel;
    public ChangeChannelCommand(TV tv,int channel){
        this.tv=tv;
        this.channel=channel;
    }
    @Override
    public void execute(){
        tv.changeChannel(channel);
    }
}
