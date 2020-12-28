package fr.codegym.task.task12.task1221;

/* 
Nous avons tous un peu de chat en nous...
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Je m'appelle Fluffy";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Je suis un chat";
        }
    }
}
