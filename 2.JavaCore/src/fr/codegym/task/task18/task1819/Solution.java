package fr.codegym.task.task18.task1819;

/* 
Combinaison de fichiers
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

        FileInputStream in = new FileInputStream(file1);
        byte[] buffer = new byte[in.available()];
        in.read(buffer);

        FileOutputStream out = new FileOutputStream(file1);

        FileInputStream in1 = new FileInputStream(file2);
        byte[] buffer2 = new byte[in1.available()];
        in1.read(buffer2);

        byte[] result = new byte[buffer.length + buffer2.length];
        System.arraycopy(buffer2, 0, result, 0, buffer2.length);
        System.arraycopy(buffer, 0, result,  buffer2.length, buffer.length);
        out.write(result);

        in.close();
        in1.close();
        out.close();

    }
}
