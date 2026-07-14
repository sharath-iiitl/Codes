package Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients;

import Behavioral_design_patterns.Visitor_design_pattern.Interfacess.Patient;
import Behavioral_design_patterns.Visitor_design_pattern.Interfacess.Visitor;

public class ChildPatient implements Patient{
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
