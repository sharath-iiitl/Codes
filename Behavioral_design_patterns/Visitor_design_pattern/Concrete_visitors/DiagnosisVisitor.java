package Behavioral_design_patterns.Visitor_design_pattern.Concrete_visitors;

import Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients.ChildPatient;
import Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients.adultPatient;
import Behavioral_design_patterns.Visitor_design_pattern.Interfacess.Visitor;

public class DiagnosisVisitor implements Visitor{

    @Override
    public void visit(adultPatient adulPatient) {
        System.out.println("Diagnosis visitor visited Adult patient");
    }
    
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Diagnosis visitor visited child patient");
    }
    
}
