package fr.codegym.task.task15.task1522;

public class Sun implements Planet {

    private static  Sun instance;

    private Sun(){

    }
    public static Sun getInstance(){
        if(instance != null)
            return instance;
        else
            instance = new Sun();
        return instance;
    }
}
