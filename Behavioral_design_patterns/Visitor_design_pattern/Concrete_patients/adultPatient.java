package Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients;

import Behavioral_design_patterns.Visitor_design_pattern.Interfacess.*;

public class adultPatient implements Patient{
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
