package fr.codegym.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Création d'un fichier
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while(true) {
            String s = console.readLine();
            if("fin".equals(s)) break;
            list.add(s);
        }
        String[] t = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            t[Integer.parseInt(list.get(i).split("part")[1])-1] = list.get(i);
        }
        FileInputStream in = null;
        FileOutputStream outputStream =  new FileOutputStream(t[0].split(".part")[0]);
        for (int i = 0; i < t.length; i++) {
            in = new FileInputStream(t[i]);
            byte[] cBuffer = new byte[in.available()];
            in.read(cBuffer);
            outputStream.write(cBuffer);


        }
        outputStream.close();
        in.close();
        console.close();
    }
}
