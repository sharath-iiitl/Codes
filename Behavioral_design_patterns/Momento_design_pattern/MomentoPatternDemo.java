package Behavioral_design_patterns.Momento_design_pattern;

public class MomentoPatternDemo {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.setText("Hello");
        history.saveState(editor.save());
        System.out.println("Initial text: " + editor.getText());
        
        editor.setText("Hello, World!");
        history.saveState(editor.save());
        System.out.println("Initial text after first change: " + editor.getText());
        
        editor.setText("Hello, World! Welcome!");
        // history.saveState(editor.save());
        System.out.println("Initial text second text: " + editor.getText());
        
        Momento previousState = history.undo(editor.save());
        if(previousState!=null){
            editor.restore(previousState);
            System.out.println("After undo: " + editor.getText());
        }

        Momento redoState = history.redo(editor.save());
        if(redoState!=null){
            editor.restore(redoState);
            System.out.println("After redo: "+editor.getText());
        }

    }
}
