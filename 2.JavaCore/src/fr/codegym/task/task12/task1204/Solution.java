package fr.codegym.task.task12.task1204;

/* 
Qu'il s'agisse d'un oiseau ou d'une lampe
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //écris ton code ici
        if(o instanceof Cat)
            System.out.println("Cat");
        else if(o instanceof Dog)
            System.out.println("Dog");
        else if(o instanceof Bird)
            System.out.println("Bird");
        else if(o instanceof Lamp)
            System.out.println("Lamp");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
