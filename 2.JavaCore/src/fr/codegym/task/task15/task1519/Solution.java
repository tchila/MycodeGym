package fr.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Différentes méthodes pour différents types
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //écris ton code ici
        List<String> objects = new ArrayList<>();
        while (true){
            String s = bufferedReader.readLine();
            if("quitter".equals(s) ) break;
            objects.add(s);
        }

        for (String object : objects) {
            boolean correctD = object.matches("[-+]?[0-9]*\\.{1}[0-9]+");
            boolean correctI = object.matches("-?\\d+");
            if(correctD){
                print(Double.parseDouble(object));
            }else if (correctI){
                int i = Integer.parseInt(object);
                if(i>0 && i<128)
                    print((short)i);
                else
                    print(i);
            }else
                print(object);

        }

    }

    public static void print(Double value) {
        System.out.println("C'est un Double. Valeur : " + value);
    }

    public static void print(String value) {
        System.out.println("C'est un String. Valeur : " + value);
    }

    public static void print(short value) {
        System.out.println("C'est un short. Valeur : " + value);
    }

    public static void print(Integer value) {
        System.out.println("C'est un Integer. Valeur : " + value);
    }
}
