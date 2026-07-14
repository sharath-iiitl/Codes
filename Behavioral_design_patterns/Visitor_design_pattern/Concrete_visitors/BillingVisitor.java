package Behavioral_design_patterns.Visitor_design_pattern.Concrete_visitors;

import Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients.ChildPatient;
import Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients.adultPatient;
import Behavioral_design_patterns.Visitor_design_pattern.Interfacess.Visitor;

public class BillingVisitor implements Visitor{
    @Override
    public void visit(ChildPatient childPatient){
        System.out.println("Billing visitor visiting child patient");
    }
    @Override
    public void visit(adultPatient adulPatient){
        System.out.println("Billing visitor visiting adult patient");
    }
}
