package fr.masteril.tp3spring.modele;

public class IdGenerator {
    private static IdGenerator instance;
    private int currentId;

    private IdGenerator(){
        currentId = 0;
    }

    public static IdGenerator getInstance(){
        if(instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public static int generateId(){
        return getInstance().currentId++;
    }
}
