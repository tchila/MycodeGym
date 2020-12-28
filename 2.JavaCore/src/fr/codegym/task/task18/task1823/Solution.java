package fr.codegym.task.task18.task1823;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Threads et octets
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if ("quitter".equals(s)) break;
            ReadThread readThread = new ReadThread(s);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            // Implémenter le corps du constructeur
            this.fileName = fileName;
        }
        // Implémenter la lecture du fichier ici

        @Override
        public void run() {
            Map<Integer, Integer> map = new HashMap<>();
            int max = 0;
            FileInputStream in = null;
            try {
                in = new FileInputStream(fileName);
                while (in.available() > 0) {
                    int i = in.read();
                    if (map.get(i) == null) {
                        map.put(i, 1);
                    } else {
                        int value = map.get(i);
                        map.put(i, value + 1);
                    }

                }
                for (int i : map.values()) {
                    if (i > max)
                        max =i;
                }
                for (Map.Entry<Integer, Integer> k :
                        map.entrySet()) {
                    if (k.getValue() == max){
                        resultMap.put(fileName,k.getKey());
                        break;
                    }

                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
