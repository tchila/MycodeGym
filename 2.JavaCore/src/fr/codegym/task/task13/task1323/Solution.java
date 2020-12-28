package fr.codegym.task.task13.task1323;

/* 
Interface Updatable dans la classe Screen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable  {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
