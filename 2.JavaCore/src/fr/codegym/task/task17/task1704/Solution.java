package fr.codegym.task.task17.task1704;

import java.util.ArrayList;
import java.util.List;

/* 
Notes synchronisées : partie 2
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();

        public synchronized void  addNote(int index, String note) {
            System.out.println("Une note [" + note + "] va maintenant être ajoutée à la position " + index);
            notes.add(index, note);
            System.out.println("La note [" + note + "] a déjà été ajoutée");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Une note va maintenant être supprimée de la position " + index);
            String note = notes.remove(index);
            System.out.println("La note [" + note + "] a déjà été supprimée de la position " + index);
        }
    }
}