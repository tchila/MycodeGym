package fr.codegym.task.task09.task0909;

/* 
Exception lorsque tu travailles avec des tableaux
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici


        try {
            int[] m = new int[2];
            m[8] = 5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        //écris ton code ici
    }
}
