package com.codegym.task.task40.task4008;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

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
        if (date.length() > 10) {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d.M.y");
            LocalDate localDate = LocalDate.parse(date.split(" ")[0], dateFormatter);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H:m:s");
            LocalTime time = LocalTime.parse(date.split(" ")[1], timeFormatter);

            System.out.println("Day: " + localDate.getDayOfMonth());
            System.out.println("Day of the week: " + localDate.getDayOfWeek().getValue());
            System.out.println("Day of the month: " + localDate.getDayOfMonth());
            System.out.println("Day of the year: " + localDate.getDayOfYear());
            System.out.println("Week of the month: " + localDate.get(WeekFields.of(Locale.getDefault()).weekOfMonth()));
            System.out.println("Week of the year: " + localDate.get(WeekFields.of(Locale.getDefault()).weekOfYear()));
            System.out.println("Month: " + localDate.getMonthValue());
            System.out.println("Year: " + localDate.getYear());
            System.out.println("AM or PM: " + (time.isAfter(LocalTime.NOON) ? "PM" : "AM"));
            System.out.println("Hour: " + (time.isAfter(LocalTime.NOON) ? time.getHour() - 12 : time.getHour()));
            System.out.println("Hour of the day: " + time.getHour());
            System.out.println("Minutes: " + time.getMinute());
            System.out.println("Seconds: " + time.getSecond());

        }
        if (date.length() < 11 && date.contains(".")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.y");
            LocalDate localDate = LocalDate.parse(date, formatter);
            System.out.println("Day: " + localDate.getDayOfMonth());
            System.out.println("Day of the week: " + localDate.getDayOfWeek().getValue());
            System.out.println("Day of the month: " + localDate.getDayOfMonth());
            System.out.println("Day of the year: " + localDate.getDayOfYear());
            System.out.println("Week of the month: " + localDate.get(WeekFields.of(Locale.getDefault()).weekOfMonth()));
            System.out.println("Week of the year: " + localDate.get(WeekFields.of(Locale.getDefault()).weekOfYear()));
            System.out.println("Month: " + localDate.getMonthValue());
            System.out.println("Year: " + localDate.getYear());
        }
        if (date.length() < 11 && date.contains(":")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m:s");
            LocalTime time = LocalTime.parse(date, formatter);
            System.out.println("AM or PM: " + (time.isAfter(LocalTime.NOON) ? "PM" : "AM"));
            System.out.println("Hour: " + (time.isAfter(LocalTime.NOON) ? time.getHour() - 12 : time.getHour()));
            System.out.println("Hour of the day: " + time.getHour());
            System.out.println("Minutes: " + time.getMinute());
            System.out.println("Seconds: " + time.getSecond());
        }
    }

}
