package fr.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Analyseur de requêtes
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s =  bufferedReader.readLine();
        String[] params  = s.split("\\?")[1].split("&");
        String ss ="";
        String value =  "";
        for (String param : params) {
            String[] values = param.split("=");
            if ("obj".equals(values[0]))
                value = values[1];
            ss += param.split("=")[0] + " ";

        }
        System.out.println(ss);
        boolean correctD = value.matches("[-+]?[0-9]*\\.{1}[0-9]+");
       if(!value.isEmpty()){

           try{
               alert(Double.parseDouble(value));
           }catch (NumberFormatException e){
               alert(value);
           }

       }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
