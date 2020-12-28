package fr.codegym.task.task15.task1503;

/* 
POO : Voitures
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuryCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.GeoMetro().printlnDesire();
    }

    public static class Ferrari extends LuxuryCar {
        public void printlnDesire() {
            //écris ton code ici
            System.out.println(Constants.WANT_STRING+Constants.FERRARI_NAME);
        }
    }

    public static class GeoMetro extends CheapCar{
        public void printlnDesire() {
            //écris ton code ici
            System.out.println(Constants.WANT_STRING+Constants.GEO_METRO_NAME);

        }
    }

    public static class LuxuryCar {
        protected void printlnDesire() {
            //écris ton code ici
            System.out.println(Constants.WANT_STRING+Constants.LUXURY_CAR);

        }
    }

    public static class CheapCar {
        protected void printlnDesire() {
            //écris ton code ici
            System.out.println(Constants.WANT_STRING+Constants.CHEAP_CAR);

        }
    }

    public static class Constants {
        public static String WANT_STRING = "Je veux conduire ";
        public static String LUXURY_CAR = "une voiture de luxe";
        public static String CHEAP_CAR = "une voiture bon marché";
        public static String FERRARI_NAME = "une Ferrari";
        public static String GEO_METRO_NAME = "une Geo Metro";
    }
}
