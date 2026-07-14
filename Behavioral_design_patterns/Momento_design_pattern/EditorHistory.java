package Behavioral_design_patterns.Momento_design_pattern;

import java.util.Stack;

public class EditorHistory {
    private Stack<Momento> history = new Stack<>();
    private Stack<Momento> undoStack = new Stack<>();
    private Stack<Momento> redoStack = new Stack<>();

    public void push(Momento momento){
        history.push(momento);
    }

    public Momento pop(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return null;
    }

    public void saveState(Momento momento){
        undoStack.push(momento);
        redoStack.clear();
    }

    public Momento undo(Momento currState){
        if(!undoStack.isEmpty()){
            redoStack.push(currState);
            return undoStack.pop();
        }
        return null;
    }
    
    public Momento redo(Momento currState){
        if(!redoStack.isEmpty()){
            undoStack.push(currState);
            return redoStack.pop();
        }
        return null;
    }

}
