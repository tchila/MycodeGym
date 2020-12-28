package fr.codegym.task.task06.task0605;


import java.io.*;

/* 
Contrôle du poids corporel
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double poids = Double.parseDouble(bis.readLine());
        double taille = Double.parseDouble(bis.readLine());

        Corps.calculerIMC(poids, taille);
    }

    public static class Corps {
        public static void calculerIMC(double poids, double taille) {
            // écris ton code ici
            double indice = poids / (taille*taille);

                    if(indice < 18.5)
                        System.out.println("Insuffisance pondérale : IMC < 18,5");
                    else if (18.5 <= indice && indice < 25)
                        System.out.println("Poids normal : 18,5 <= IMC < 25");
                    else if (25 <= indice && indice < 30)
                        System.out.println("Surpoids : 25 <= IMC < 30");
                    else
                        System.out.println("Obésité : IMC >= 30");


        }
    }
}
