package Prototype_design_pattern;

public class Main {
    public static void main(String[] args){
        CharacterFactory characterFactory = new CharacterFactory();
        try{
        Character ch = characterFactory.createCharacterWithNewName("nani");
        ch.showCharacterInfo();
        }
        catch(CloneNotSupportedException e){
            System.err.println("Cloneing failed: " + e.getMessage());
        }
    }
}
