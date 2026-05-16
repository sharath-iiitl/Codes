package Prototype_design_pattern;

public class CharacterFactory {
    private Character prototypeCharater;

    public CharacterFactory(){
        prototypeCharater=new Character("DefaultName", 100, 50, 1);
    }

public Character createCharacterWithNewName(String name) throws CloneNotSupportedException {
        Character clonedCharater = prototypeCharater.clone();
        clonedCharater.setName(name);
        return clonedCharater;
    }
}
