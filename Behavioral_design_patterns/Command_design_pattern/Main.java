package Behavioral_design_patterns.Command_design_pattern;

import Behavioral_design_patterns.Command_design_pattern.Concrete_Commands.*;
import Behavioral_design_patterns.Command_design_pattern.Core_classes.RemoteControl;
import Behavioral_design_patterns.Command_design_pattern.Core_classes.TV;

public class Main {
    public static void main(String[] args){
        TV tv = new TV();
        Command turnOn=new TurnOnCommand(tv);
        Command turnoff=new TurnOffCommand(tv);
        Command changeChannel=new ChangeChannelCommand(tv, 5);
        Command adjustVolume=new AdjustVolumeCommand(tv, 20);

        RemoteControl remote=new RemoteControl();
        remote.setOnCommand(turnOn);
        remote.setOffCommand(turnoff);
        remote.pressOnButton();
        changeChannel.execute();
        adjustVolume.execute();
        remote.pressOffButton();
    }
}
