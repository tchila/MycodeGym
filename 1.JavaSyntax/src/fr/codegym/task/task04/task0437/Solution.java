package fr.codegym.task.task04.task0437;


/* 
Triangle de « 8 »
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        for (int i =1 ; i <= 10 ; i++) {
            for (int j =1 ; j <= i ; j++) {
                if(j<i)
                    System.out.print(8);
                else
                    System.out.println(8);
            }
        }
    }
}
