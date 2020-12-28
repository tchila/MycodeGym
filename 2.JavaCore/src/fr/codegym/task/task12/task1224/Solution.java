package fr.codegym.task.task12.task1224;

/* 
Animal inconnu
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //écris ton code ici
        if(o instanceof Cat){
            return "Chat";
        }else if(o instanceof Tiger){
            return "Tigre";
        }else if(o instanceof Lion){
            return "Lion";
        }else if(o instanceof Bull){
            return "Taureau";
        }else{
            return "Animal";
        }

    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
