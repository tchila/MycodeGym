package fr.codegym.task.task18.task1810;

/*
DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String file1 = scanner.nextLine();
            FileInputStream inputStream = new FileInputStream(file1);
            if (inputStream.available()< 1000){
                throw new DownloadException();
            }
            inputStream.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
