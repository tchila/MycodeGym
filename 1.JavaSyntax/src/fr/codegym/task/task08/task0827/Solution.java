package fr.codegym.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Travail avec les dates
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(dateImpaire("MAY 1 2013"));
    }

    public static boolean dateImpaire(String date) throws ParseException {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("MMM d yyyy")
                .toFormatter(Locale.ENGLISH);

        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);

        int dayNumber = localDate.getDayOfYear();
        System.out.println(dayNumber);
        if (dayNumber % 2 == 0){
            return false;
        }
        else return true;
    }
}
