package fr.codegym.task.task13.task1302;

/* 
Bière. Partie 2. Le jour d'après.
*/

public class Solution {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Boisson alcoolisée";
            } else {
                return "Boisson non alcoolisée";
            }

        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
}