package fr.codegym.task.task09.task0929;

import java.io.*;

/* 
Modifions le code pour qu'il fasse quelque chose d'utile !
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream = null;
        String nomFichierSource = null;
        int i = 1;
        while (i>=0) {
            nomFichierSource = lecteur.readLine();

            try {
                fileInputStream = obtenirInputStream(nomFichierSource);
                i=i-2;
            } catch (IOException e) {
                System.out.println("Le fichier n'existe pas.");
                i--;
            }
        }
        String nomFichierDestination = lecteur.readLine();

        OutputStream fileOutputStream = obtenirOutputStream(nomFichierDestination);


        while (fileInputStream.available() > 0) {
            int donnees = fileInputStream.read();
            fileOutputStream.write(donnees);
        }

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

