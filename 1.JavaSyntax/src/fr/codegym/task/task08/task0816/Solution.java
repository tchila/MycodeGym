package fr.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
La gentille Emma et les vacances d'été
*/

public class Solution {
    public static HashMap<String, Date> creerMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("q", df.parse("JUNE 1 1980"));
        map.put("s", df.parse("JULY 2 1980"));
        map.put("c", df.parse("AUGUST 3 1980"));
        map.put("d", df.parse("SEPTEMBER 4 1980"));
        map.put("e", df.parse("OCTOBER 5 1980"));
        map.put("r", df.parse("NOVEMBER 6 1980"));
        map.put("g", df.parse("DECEMBER 7 1980"));
        map.put("h", df.parse("MARCH 8 1980"));
        map.put("j", df.parse("APRIL 9 1980"));
        map.put("k", df.parse("JANUARY 10 1980"));

        //écris ton code ici
        return map;
    }

    public static void supprimerToutesPersonnesEte(HashMap<String, Date> map) {
        //écris ton code ici
        map.entrySet().removeIf(s -> (s.getValue().getDate() >= 1 && s.getValue().getMonth() >= 5) && (s.getValue().getDate() <= 31 && s.getValue().getMonth() <= 7));


    }

    public static void main(String[] args) throws ParseException {
supprimerToutesPersonnesEte(creerMap());
    }
}
