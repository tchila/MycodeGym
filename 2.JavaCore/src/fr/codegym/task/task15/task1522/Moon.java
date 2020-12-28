package fr.codegym.task.task15.task1522;

public class Moon implements Planet {
    private static  Moon instance;

    private Moon(){

    }
    public static Moon getInstance(){
        if(instance != null)
            return instance;
        else
            instance = new Moon();
        return instance;
    }
}
