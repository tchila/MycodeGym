package fr.codegym.task.task14.task1408;

/* 
Usine de poules
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;

            if (continent == Continent.AFRICA) {
                hen = new AfricanHen();
            }else if (continent == Continent.NORTHAMERICA)
                hen = new NorthAmericanHen();
            else if (continent == Continent.ASIA)
                hen = new AsianHen();
            else if (continent == Continent.EUROPE)
                hen = new EuropeanHen();
            return hen;
        }
    }













}
