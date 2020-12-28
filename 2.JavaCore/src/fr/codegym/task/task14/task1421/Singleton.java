package fr.codegym.task.task14.task1421;

public class Singleton {

    private static Singleton instance = new Singleton();
    private Singleton() {

    }

    public static Singleton getInstance(){
        if(instance != null)
            return instance;
        return new Singleton();
    }
}
