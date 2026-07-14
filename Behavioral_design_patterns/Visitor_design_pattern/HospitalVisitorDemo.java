package Behavioral_design_patterns.Visitor_design_pattern;

import Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients.ChildPatient;
import Behavioral_design_patterns.Visitor_design_pattern.Concrete_patients.adultPatient;
import Behavioral_design_patterns.Visitor_design_pattern.Concrete_visitors.BillingVisitor;
import Behavioral_design_patterns.Visitor_design_pattern.Concrete_visitors.DiagnosisVisitor;
import Behavioral_design_patterns.Visitor_design_pattern.Interfacess.Patient;
import Behavioral_design_patterns.Visitor_design_pattern.Interfacess.Visitor;

public class HospitalVisitorDemo {
    public static void main(String[] args){
        Patient[] patients = {new ChildPatient(),new adultPatient()};
        Visitor diaVisitor=new DiagnosisVisitor();
        Visitor billVisitor=new BillingVisitor();
        for(Patient patient:patients){
            patient.accept(billVisitor);
            patient.accept(diaVisitor);
        }
    }
}
