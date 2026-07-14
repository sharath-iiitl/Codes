package Behavioral_design_patterns.Momento_design_pattern;

public class TextEditor {
    private String text;
    public void setText(String text){
        this.text=text;
    }
    public String getText(){
        return text;
    }

    public Momento save(){
        return new Momento(text);
    }

    public void restore(Momento momento){
        this.text=momento.getText();
    }
}
