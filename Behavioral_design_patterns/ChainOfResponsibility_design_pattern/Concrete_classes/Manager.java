package Behavioral_design_patterns.ChainOfResponsibility_design_pattern.Concrete_classes;

import Behavioral_design_patterns.ChainOfResponsibility_design_pattern.Approver;

public class Manager extends Approver{
    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=7){
            System.out.println("Supervisor approved the leave..");;
        }
        else if(nextApprover!=null){
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
    
}
