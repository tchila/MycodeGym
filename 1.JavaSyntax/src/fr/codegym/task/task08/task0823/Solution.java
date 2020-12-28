package fr.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/* 
Expansion nationale
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        String s = lecteur.readLine();
        boolean nextTileCase = true;
        StringBuilder stringBuilder = new StringBuilder(s.length());
        for (char c :
                s.toCharArray()) {
            if (Character.isSpaceChar(c))
                nextTileCase = true;
            else if (nextTileCase) {
                c = Character.toTitleCase(c);
                nextTileCase = false;
            }
            stringBuilder.append(c);

        }
        System.out.println(stringBuilder.toString());
        //écris ton code ici
    }
}
