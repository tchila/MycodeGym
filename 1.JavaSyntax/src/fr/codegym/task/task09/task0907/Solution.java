package fr.codegym.task.task09.task0907;

/* 
Exception lorsque tu travailles avec des nombres
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        try {
            int a = 42 / 0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }


        //écris ton code ici
    }
}
