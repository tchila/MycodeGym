package fr.codegym.task.task15.task1522;

public class Earth implements Planet {
    private static  Earth instance;

    private Earth(){

    }
    public static Earth getInstance(){
        if(instance != null)
            return instance;
        else
            instance = new Earth();
        return instance;
    }
}
