package fr.codegym.task.task18.task1803;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Les octets les plus fréquents
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        FileInputStream in = new FileInputStream(s);
        int max = 0;
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
        String outPut = "";
        for (Map.Entry<Integer, Integer> k :
                map.entrySet()) {
            if (k.getValue() == max)
                outPut += k.getKey() + " ";
        }
        System.out.println(outPut);
        in.close();
        scanner.close();

    }
}
