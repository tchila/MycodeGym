package fr.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Classe LecteurConsole
*/

public class LecteurConsole {

    public static String lireString() throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
       String s =  scanner.nextLine();
       return s;

    }

    public static int lireInt() throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;

    }

    public static double lireDouble() throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        return d;

    }

    public static boolean lireBoolean() throws Exception {
        //écris ton code ici
        Scanner scanner = new Scanner(System.in);
        boolean b = scanner.nextBoolean();
        return b;

    }

    public static void main(String[] args) {

    }
}
