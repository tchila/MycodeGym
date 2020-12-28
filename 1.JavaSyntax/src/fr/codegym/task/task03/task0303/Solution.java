package fr.codegym.task.task03.task0303;

/* 
Change de devises
*/

public class Solution {
    public static void main(String[] args) {
        //écris ton code ici
        System.out.println(conversionEurEnUsd(174, 896.4));
        System.out.println(conversionEurEnUsd(500, 896.4));
    }

    public static double conversionEurEnUsd(int eur, double tauxChange) {
        //écris ton code ici
        return eur * tauxChange;
    }
}

