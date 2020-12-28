package com.codegym.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);

        switch (args[0]) {

            //create person
            case "-c":
                for (int step = 1; step < args.length; step += 3) {
                    Date date = null;
                    try {
                        date = simpleDateFormat.parse(args[step + 2]);
                    } catch (ParseException e) {
                        e.getMessage();
                    }

                    Person person;
                    if (args[step + 1].startsWith("m"))
                        person = Person.createMale(args[step], date);
                    else
                        person = Person.createFemale(args[step], date);

                    synchronized (allPeople) {
                        allPeople.add(person);
                    }

                    System.out.println(allPeople.indexOf(person));
                }
                break;

            //update person
            case "-u": {
                synchronized (allPeople) {
                    for (int step = 1; step < args.length; step += 4) {
                        int index = Integer.parseInt(args[step]);
                        Person person = allPeople.get(index);

                        //update name
                        person.setName(args[step + 1]);

                        //udate date
                        Date date = null;
                        try {
                            date = simpleDateFormat.parse(args[step + 3]);
                        } catch (ParseException e) {
                            e.getMessage();
                        }
                        person.setBirthDate(date);

                        //update sex
                        if (args[step + 2].startsWith("m"))
                            person.setSex(Sex.MALE);
                        else
                            person.setSex(Sex.FEMALE);
                    }
                } //synchronized
                break;
            }

            //remove person
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);

                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;
            }

            //print person
            case "-i": {
                synchronized (allPeople) {
                    SimpleDateFormat simpleDateFormas = new SimpleDateFormat("MMM dd YYYY", Locale.ENGLISH);

                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        StringBuffer s = new StringBuffer();
                        s.append(person.getName());
                        s.append(" ");
                        s.append(person.getSex() == Sex.MALE ? "m" : "f");
                        s.append(" ");
                        s.append(simpleDateFormas.format(person.getBirthDate()));
                        System.out.println(s);
                    }
                }
            }
            break;
        }



    }
}
