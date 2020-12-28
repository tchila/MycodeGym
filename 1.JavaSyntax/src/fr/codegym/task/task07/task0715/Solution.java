package fr.codegym.task.task07.task0715;

import java.util.ArrayList;

/* 
Sam-I-Am, le retour
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        ArrayList<String> chaines = new ArrayList<String>();
        chaines.add("Sam");
        chaines.add("I");
        chaines.add("Am");

        for (int i = 0; i < 3; i++) {
            chaines.add(2*i+1,"Ham");
        }

        for (String chaine : chaines) {
            System.out.println(chaine);
        }
    }

}

