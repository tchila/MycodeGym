package fr.codegym.task.task04.task0410;

/* 
C'est mon jour de chance !
*/

public class Solution {
    public static void main(String[] args) {
        verifierIntervalle(60);
        verifierIntervalle(112);
        verifierIntervalle(10);
    }

    public static void verifierIntervalle(int a) {
        //écris ton code ici
        if(a < 100 && a >50){
            System.out.println("Le nombre " + a + " est dans l'intervalle.");
        }
        else
            System.out.println("Le nombre " + a + " n'est pas dans l'intervalle.");
    }
}