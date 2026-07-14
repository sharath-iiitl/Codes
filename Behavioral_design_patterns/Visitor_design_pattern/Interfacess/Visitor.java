package Behavioral_design_patterns.Visitor_design_pattern.Interfacess;

import Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients.*;

public interface Visitor {
    void visit(adultPatient adulPatient);
    void visit(ChildPatient childPatient);
}
