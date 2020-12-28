package fr.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maîtrise du bloc statique
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //écris ton code ici
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if ("helicopter".equals(s))
            result = new Helicopter();
        else if ("plane".equals(s)) {
            int i = 0;
            try {
                i = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            result = new Plane(i);

        }

    }
}
