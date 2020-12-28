package fr.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
La plus longue séquence
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //écris ton code ici
        ArrayList<Integer> chaines = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String b = bufferedReader.readLine();
            chaines.add(Integer.parseInt(b));
        }
        int maxOcc = 1;
        int nbOcc = 1;
        for (int i = 1; i < chaines.size(); i++) {
            if(chaines.get(i).equals(chaines.get(i-1)) ){
                nbOcc++;
                if(nbOcc>maxOcc)
                    maxOcc=nbOcc;
            }else{
                if(nbOcc>maxOcc)
                    maxOcc=nbOcc;
                nbOcc=1;
            }

        }

        System.out.println(maxOcc);

    }
}