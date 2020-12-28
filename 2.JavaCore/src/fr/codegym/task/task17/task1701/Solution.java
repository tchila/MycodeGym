package fr.codegym.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Notes
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Un autre thread a supprimé notre note");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Le thread [" + threadName + "] a supprimé la note de quelqu'un d'autre [" + note + "]");
            } else {
                System.out.println("Le thread [" + threadName + "] a supprimé sa propre note [" + note + "]");
            }
        }
    }

    public static class NoteThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                Note.addNote(getName()+"-Note"+i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {

                }
                Note.removeNote(getName());
            }
        }
    }
}
