package com.codegym.task.task40.task4007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* 
Working with Java 8's DateTime API

*/

public class Solution {
    public static void main(String[] args) {
        printDate("21.4.2014 15:56:45");
        System.out.println();
        printDate("21.4.2014");
        System.out.println();
        printDate("17:33:40");
    }

    public static void printDate(String date) {
        //write your code here
        Calendar calendar = Calendar.getInstance();
        if (date.length() > 10) {
            SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd.M.yyyy HH:mm:ss");
            try {
                calendar.setTime(dateTimeFormat.parse(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
            System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("Day of the week: " + (dayOfWeek == 0 ? 7 : dayOfWeek));
            System.out.println("Day of the month: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("Day of the year: " + calendar.get(Calendar.DAY_OF_YEAR));
            System.out.println("Week of the month: " + calendar.get(Calendar.WEEK_OF_MONTH));
            System.out.println("Week of the year: " + calendar.get(Calendar.WEEK_OF_YEAR));
            System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
            System.out.println("Year: " + calendar.get(Calendar.YEAR));
            System.out.println("AM or PM: " + (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
            System.out.println("Hour: " + calendar.get(Calendar.HOUR));
            System.out.println("Hour of the day: " + calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("Minutes: " + calendar.get(Calendar.MINUTE));
            System.out.println("Seconds: " + calendar.get(Calendar.SECOND));

        }
        if (date.length() < 11 && date.contains(".")) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.M.yyyy");
            try {
                calendar.setTime(dateFormat.parse(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
            System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("Day of the week: " + (dayOfWeek == 0 ? 7 : dayOfWeek));
            System.out.println("Day of the month: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("Day of the year: " + calendar.get(Calendar.DAY_OF_YEAR));
            System.out.println("Week of the month: " + calendar.get(Calendar.WEEK_OF_MONTH));
            System.out.println("Week of the year: " + calendar.get(Calendar.WEEK_OF_YEAR));
            System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
            System.out.println("Year: " + calendar.get(Calendar.YEAR));

        }
        if (date.length() < 11 && date.contains(":")) {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            try {
                calendar.setTime(timeFormat.parse(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("AM or PM: " + (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
            System.out.println("Hour: " + calendar.get(Calendar.HOUR));
            System.out.println("Hour of the day: " + calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("Minutes: " + calendar.get(Calendar.MINUTE));
            System.out.println("Seconds: " + calendar.get(Calendar.SECOND));
        }

    }
}
