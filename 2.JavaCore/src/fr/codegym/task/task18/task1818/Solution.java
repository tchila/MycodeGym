package fr.codegym.task.task18.task1818;

/* 
Deux en un
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
        String file3 = scanner.nextLine();
        FileOutputStream out = new FileOutputStream(file1);

        FileInputStream in = new FileInputStream(file2);
        FileInputStream in1 = new FileInputStream(file3);

        int i;
        while ((i = in.read()) != -1) {
            out.write(i);
        }

         out = new FileOutputStream(file1, true);
        while ((i = in1.read()) != -1) {
            out.write(i);
        }
        out.close();
        in.close();
        in1.close();
    }
}
