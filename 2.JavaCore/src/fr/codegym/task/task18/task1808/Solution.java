package fr.codegym.task.task18.task1808;

/* 
Division d'un fichier
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outFileInputStream = new FileOutputStream(file2);
        FileOutputStream outFileInputStream1 = new FileOutputStream(file3);

        int i, j;

        try {
            int length = inputStream.available();
            if ((length % 2 != 0)) {
                i = length / 2 +1;
                while (i > 0) {
                    int c = inputStream.read();
                    outFileInputStream.write(c);
                    i--;
                }
                j = length / 2 ;
                while (j > 0) {
                    int c = inputStream.read();
                    outFileInputStream1.write(c);
                    j--;
                }

            } else {
                i = length / 2;
                j = length / 2;

                while (i > 0) {
                    int c = inputStream.read();
                    outFileInputStream.write(c);
                    i--;
                }
                while (j > 0) {
                    int c = inputStream.read();
                    outFileInputStream1.write(c);
                    j--;
                }
            }
        } catch (IOException e) {
        }

        inputStream.close();
        outFileInputStream.close();
        outFileInputStream1.close();
    }
}
