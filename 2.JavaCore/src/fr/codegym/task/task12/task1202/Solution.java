package fr.codegym.task.task12.task1202;

/* 
Les baleines, descendantes des vaches
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Je suis une vache";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "";
        }
    }
}
