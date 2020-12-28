package fr.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Quelle est la date d'aujourd'hui ?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //écris ton code ici
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s  =  bufferedReader.readLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        Date date = simpleDateFormat.parse(s);
        SimpleDateFormat simpleDateFormas = new SimpleDateFormat("MMM dd, YYYY",Locale.US);
        System.out.println(simpleDateFormas.format(date).toUpperCase());

    }
}
