package fr.codegym.task.task04.task0411;

/* 
Saisons sur Terre
*/

public class Solution {
    public static void main(String[] args) {
        verifierSaison(12);
        verifierSaison(4);
        verifierSaison(7);
        verifierSaison(10);
    }

    public static void verifierSaison(int mois) {
        //écris ton code ici
        if(mois == 12 || mois == 1 || mois == 2){
            System.out.println("hiver");
        }else if(mois == 3 || mois == 5 || mois == 4){
            System.out.println("printemps ");

        }else if(mois == 7 || mois == 8 || mois == 6){
            System.out.println("été");

        }else{
            System.out.println("automne");

        }
    }
}