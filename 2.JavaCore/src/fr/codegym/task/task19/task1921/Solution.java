package fr.codegym.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* 
John Johnson
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);

        BufferedReader bufferedReader =  new BufferedReader(new FileReader(args[0]));
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
           int i = 0;
            while (!Character.isDigit(line.charAt(i)))
                i++;
            String nom = line.substring(0,i).trim();
            String date = line.substring(i).trim();
            PEOPLE.add(new Person(nom, simpleDateFormat.parse(date.trim())));


        }
        System.out.println(PEOPLE);
        bufferedReader.close();

    }
}
