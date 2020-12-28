package fr.codegym.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Notes synchronisées
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();

        public void addNote(int index, String note) {
            System.out.println("Une note [" + note + "] va maintenant être ajoutée à la position " + index);
            synchronized (notes){
                notes.add(index, note);
            }
            System.out.println("La note [" + note + "] a déjà été ajoutée");
        }

        public void removeNote(int index) {
            System.out.println("Une note va maintenant être supprimée de la position " + index);
            String note;
            synchronized (notes){
                 note = notes.remove(index);
            }
            System.out.println("La note [" + note + "] a déjà été supprimée de la position " + index);
        }
    }

}
