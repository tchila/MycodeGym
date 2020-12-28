package fr.codegym.task.task09.task0912;

/* 
Exception lorsque tu travailles avec des nombres
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }


        //écris ton code ici
    }
}
