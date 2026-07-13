package Behavioral_design_patterns.ChainOfResponsibility_design_pattern;

import Behavioral_design_patterns.ChainOfResponsibility_design_pattern.Concrete_classes.*;

public class LeaveRequestChainDemo {
    public static void main(String[] args){
        Approver supervisor=new Supervisor();
        Approver manager=new Manager();
        Approver director=new Director();
        supervisor.setNextAprrover(manager);
        manager.setNextAprrover(director);

        supervisor.processLeaveRequest(10);
    }
    
}
