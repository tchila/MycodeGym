package fr.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Méthode dans un try-catch
*/

public class Solution {
    public static void main(String[] args) {
        lireDonnees();
    }

    public static void lireDonnees() {
        //écris ton code ici
        List<Double> nbre = new ArrayList<>();
        try {
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                double i =  Double.parseDouble(bufferedReader.readLine());
                nbre.add(i);
            }
        } catch (NumberFormatException e) {
            for (Double aDouble : nbre) {
                System.out.println(aDouble);
            }
        }catch (IOException e) {

        }
    }
}
