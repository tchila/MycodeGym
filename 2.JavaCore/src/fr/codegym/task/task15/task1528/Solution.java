package fr.codegym.task.task15.task1528;

/* 
POO : L'Euro, c'est aussi de l'argent
*/

public class Solution {
    public static void main(String[] args)
    {
        System.out.println(new Euro().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    // Ajoute ton code ci-dessous
    public static class Euro extends Money {
        private double amount = 123d;

        public Euro getMoney() {
            return this;
        }

        public Object getAmount() {
            return getMoney().amount;
        }
    }
}
