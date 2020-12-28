package fr.codegym.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

/* 
Navet
*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Navet"));
        plot.add(new Person("Grand-père"));
        plot.add(new Person("Grand-mère"));
        plot.add(new Person("Petite-fille"));
        TurnipStory.tell(plot);
    }
}
