package fr.codegym.task.task18.task1822;

/* 
Trouver des données dans un fichier
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        scanner = new Scanner(new FileInputStream(file1));
        String nomProduit = "";
        double prix = 0.0 ;
        int quantite = 0;
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.matches("-?\\d+")){
                int id = Integer.parseInt(s);
            if (id == Integer.parseInt(args[0])) {
                while (!scanner.hasNext("[-+]?[0-9]*\\.?[0-9]+")) {
                    nomProduit += scanner.next()+ " ";
                }
                if (scanner.hasNext("[-+]?[0-9]*\\.?[0-9]+")) {
                    String ss = scanner.next();
                    prix = Double.parseDouble(ss);
                }
                if (scanner.hasNext("-?\\d+")) {
                    quantite = scanner.nextInt();
                }
            }
        }

        }
        System.out.println(args[0] +" " + nomProduit  + prix + " " + quantite);

        scanner.close();

    }
}
