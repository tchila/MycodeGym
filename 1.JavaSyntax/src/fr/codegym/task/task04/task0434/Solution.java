package fr.codegym.task.task04.task0434;


/* 
Table de multiplication
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int i = 1;
        while(i <= 10){
            int j = 1;
            while (j <=10){
                if(j< 10)
                    System.out.print(i*j+" ");
                else
                    System.out.println(i*j);
                j++;
            }
            i++;
        }
    }
}
