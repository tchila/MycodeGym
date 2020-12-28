package fr.codegym.task.task12.task1205;

/* 
Identification des animaux
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //écris ton code ici
        if(o instanceof Cow)
            return "Vache";
        else if(o instanceof Dog)
            return "Chien";
        else if(o instanceof Whale)
            return "Baleine";
        else
            return "Animal inconnu";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
