package fr.codegym.task.task12.task1228;

/* 
Interfaces pour la classe Human
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Employee {
        public void workLazily();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazily();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human  implements Secretary, Employee, Businessman{

        public void workHard() {
        }

        public void workLazily() {
        }


    }
}
