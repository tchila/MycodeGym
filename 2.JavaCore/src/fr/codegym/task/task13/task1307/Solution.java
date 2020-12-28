package fr.codegym.task.task13.task1307;

/* 
Interface paramétrée
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>//écris ton code ici
    {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}