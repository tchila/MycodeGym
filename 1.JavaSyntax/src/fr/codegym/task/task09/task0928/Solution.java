package fr.codegym.task.task09.task0928;

import java.io.*;

/* 
Le code refuse de compiler...
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

        String nomFichierSource = lecteur.readLine();
        String nomFichierDestination = lecteur.readLine();

        InputStream fileInputStream = obtenirInputStream(nomFichierSource);
        OutputStream fileOutputStream = obtenirOutputStream(nomFichierDestination);

        int total = 0;
        while (fileInputStream.available() > 0) {
            int donnees = fileInputStream.read();
            fileOutputStream.write(donnees);
            total++;
        }

        System.out.println("Octets copiés : " + total);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream obtenirInputStream(String nomFichier) throws IOException {
        return new FileInputStream(nomFichier);
    }

    public static OutputStream obtenirOutputStream(String nomFichier) throws IOException {
        return new FileOutputStream(nomFichier);
    }
}
