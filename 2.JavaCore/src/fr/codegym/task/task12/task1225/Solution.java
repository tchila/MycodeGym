package fr.codegym.task.task12.task1225;

/* 
Visiteurs
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //écris ton code ici
        if(o instanceof Tiger){
            return "Tigre";
        }else if(o instanceof Lion){
            return "Lion";
        } else if(o instanceof Cat){
            return "Chat";
        }else if(o instanceof Bull){
            return "Taureau";
        }else if(o instanceof Cow){
            return "Vache";
        }else if(o instanceof Animal){
            return "Animal";
        }

        return "";
    }

    public static class Cat extends Animal   // <-- Héritage de classe !
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
