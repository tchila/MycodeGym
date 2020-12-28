package fr.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Utilisateur, perdant, codeur et programmeur
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true){
             key = reader.readLine();
            if(!key.equals("user")   && !key.equals("loser") && !key.equals("coder")  &&  !key.equals("programmer"))
                break;
            if (key == "user") {
                person = new Person.User();
            }else if (key == "loser") {
                person = new Person.Loser();
            }else if (key == "coder") {
                person = new Person.Coder();
            }else if (key == "programmer") {
                person = new Person.Programmer();
            }
            doWork(person);
        }

        // Voici la boucle pour la lecture des clés. Élément 1
    }

    public static void doWork(Person person) {
        // Élément 3
        if (person instanceof  Person.User) {
            ((Person.User) person).live();
        }else if (person instanceof  Person.Loser) {
            ((Person.Loser) person).doNothing();
        }else if (person instanceof  Person.Coder) {
            ((Person.Coder) person).writeCode();
        }else if (person instanceof  Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }
    }
}
