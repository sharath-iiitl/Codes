package Behavioral_design_patterns.ChainOfResponsibility_design_pattern;

public abstract class Approver {
    protected Approver nextApprover;
    public void setNextAprrover(Approver nextApprover){
        this.nextApprover=nextApprover;
    }

    public abstract void processLeaveRequest(int leaveDays);
}
