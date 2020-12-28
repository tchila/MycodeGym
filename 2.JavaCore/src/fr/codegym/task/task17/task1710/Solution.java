package fr.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) {
        // Commencer ici
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c": {
                try {
                        Date date = simpleDateFormat.parse(args[3]);
                        if ("m".equals(args[2])) {
                            allPeople.add(Person.createMale(args[1], date));
                        } else if ("f".equals(args[2])) {
                            allPeople.add(Person.createFemale(args[1], date));

                        }
                        System.out.println(allPeople.size()-1);

                } catch (ParseException e) {
                }
                break;
            }
            case "-u": {
                try {

                        Person person = allPeople.get(Integer.parseInt(args[1]));
                        person.setName(args[2]);
                    if ("m".equals(args[3])) {
                            person.setSex(Sex.MALE);
                        } else if ("f".equals(args[3])) {
                            person.setSex(Sex.FEMALE);
                        }
                        Date date = simpleDateFormat.parse(args[4]);
                        person.setBirthDate(date);
                        allPeople.set(Integer.parseInt(args[1]), person);

                    System.out.println(allPeople);

                } catch (ParseException e) {
                }
                break;
            }
            case "-d": {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                allPeople.set(Integer.parseInt(args[1]), person);
                break;
            }
            case "-i": {
                SimpleDateFormat simpleDateFormas = new SimpleDateFormat("MMM dd YYYY",Locale.ENGLISH);
                Person person = allPeople.get(Integer.parseInt(args[1]));
                String s = person.getSex() == Sex.FEMALE ? "f" : "m";
                System.out.println(person.getName() + " " + s + " "+ simpleDateFormas.format(person.getBirthDate()));
                break;
            }
            default:
                break;
        }
    }
}
