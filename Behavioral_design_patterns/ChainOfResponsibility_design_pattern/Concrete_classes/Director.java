package Behavioral_design_patterns.ChainOfResponsibility_design_pattern.Concrete_classes;

import Behavioral_design_patterns.ChainOfResponsibility_design_pattern.Approver;

public class Director extends Approver{
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=12){
            System.out.println("Supervisor approved the leave..");;
        }
        else{
            System.out.println("leave not approved..");;
        }
    }
}
