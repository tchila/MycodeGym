package fr.codegym.task.task18.task1824;

/* 
Fichiers et exceptions
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileInputStream in = null;
        while(true){
            String s = scanner.nextLine();
            try
            {
                in  = new FileInputStream(s);
                in.read();
            }
            catch(FileNotFoundException e) {
                System.out.println(s);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        scanner.close();
    }
}
