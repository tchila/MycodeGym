package fr.codegym.task.task04.task0433;


/* 
Je vois des dollars dans ton avenir
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        int i = 10;
        while(i>0){
            int j = 10;
            while (j >0){
                if(j>1)
                    System.out.print("$");
                else
                    System.out.println("$");
                j--;
            }
            i--;
        }

    }
}
