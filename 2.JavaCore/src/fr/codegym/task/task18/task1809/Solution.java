package fr.codegym.task.task18.task1809;

/* 
Inversion d'un fichier
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outFileInputStream = new FileOutputStream(file2);

        List<Integer> octets = new ArrayList<>();
        while (inputStream.available()>0){
            int c = inputStream.read();
            octets.add(c);
        }
        for (int i = octets.size()-1; i>=0; i--) {
            outFileInputStream.write(octets.get(i));
        }
        inputStream.close();
        scanner.close();
        outFileInputStream.close();

    }
}
