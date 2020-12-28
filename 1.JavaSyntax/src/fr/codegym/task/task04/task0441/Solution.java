package fr.codegym.task.task04.task0441;


/* 
Plutôt moyen
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if((a < b && b <c ) || (a > b && b >c )){
            System.out.println(b);
        }
        if((a < c && c < b)|| (a > c && c > b)){
            System.out.println(c);
        }
        if((b < a && a<c)|| (b>a && a>c)){
            System.out.println(a);
        }
        if(a == b || b ==c){
            System.out.println(b);
        }else if(a ==c || c == b){
            System.out.println(c);
        }

    }
}
