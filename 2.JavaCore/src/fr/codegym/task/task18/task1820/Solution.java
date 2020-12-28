package fr.codegym.task.task18.task1820;

/* 
Arrondi de nombres
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        FileOutputStream fos = new FileOutputStream(file2);

        Scanner scanner1 = new Scanner(new FileInputStream(file1));
        while (scanner1.hasNextDouble()){
            long i =  Math.round(Double.parseDouble(scanner1.next()));
            fos.write(String.valueOf(i).getBytes());
            fos.write(" ".getBytes());
        }
        scanner.close();
        scanner1.close();
        fos.close();
    }
}
