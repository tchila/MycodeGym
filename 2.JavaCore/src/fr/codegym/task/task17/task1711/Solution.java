package fr.codegym.task.task17.task1711;


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
        // Commencer ici
        switch(args[0]) {
            case "-c":  {
                synchronized (allPeople) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
                    for (int i = 3; i < args.length; i += 3) {
                        try {
                            Date date = simpleDateFormat.parse(args[i]);

                            if ("m".equals(args[i - 1])) {
                                allPeople.add(Person.createMale(args[i - 2], date));
                            } else if ("f".equals(args[i - 1])) {
                                allPeople.add(Person.createFemale(args[i - 2], date));

                            }
                            System.out.println(allPeople.size() - 1);


                        } catch (ParseException e) {
                        }
                    }
                }
                break;
            }
            case "-u":{
                synchronized (allPeople) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
                for (int i = 4; i < args.length; i += 4) {
                        try {

                                Person person = allPeople.get(Integer.parseInt(args[i - 3]));
                                person.setName(args[i - 2]);
                                if ("m".equals(args[i - 1])) {
                                    person.setSex(Sex.MALE);
                                } else if ("f".equals(args[i - 1])) {
                                    person.setSex(Sex.FEMALE);
                                }
                                Date date = simpleDateFormat.parse(args[i]);
                                person.setBirthDate(date);
                                allPeople.set(Integer.parseInt(args[i - 3]), person);


                    }catch(ParseException e){
                    }

            }
            }
                break;
            }
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {

                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                        allPeople.set(Integer.parseInt(args[i]), person);

                }
            }
                break;
            }
            case "-i": {
                synchronized (Solution.allPeople){
                for (int i = 1; i < args.length; i++) {

                    SimpleDateFormat simpleDateFormas = new SimpleDateFormat("MMM dd YYYY", Locale.ENGLISH);

                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        String s = person.getSex() == Sex.FEMALE ? "f" : "m";
                        System.out.println(person.getName() + " " + s + " " + simpleDateFormas.format(person.getBirthDate()));

                }

                }
                break;
            }
            default:
                break;
        }
    }
}
