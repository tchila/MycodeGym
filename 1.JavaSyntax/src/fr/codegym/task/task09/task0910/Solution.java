package fr.codegym.task.task09.task0910;

import java.util.ArrayList;

/* 
Exception lorsque tu travailles avec des collections List
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        try {
            ArrayList<String> liste = new ArrayList<String>();
            String s = liste.get(18);
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }


        //écris ton code ici
    }
}