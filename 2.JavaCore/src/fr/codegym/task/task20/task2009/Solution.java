package fr.codegym.task.task20.task2009;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
Comment sérialiser des champs statiques ?
*/
public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "Ceci est une chaîne de test statique";
        public int i;
        public int j;

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            out.writeObject(staticString);
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            in.defaultReadObject();
            staticString = (String)in.readObject();
        }
    }

    public static void main(String[] args) {

    }
}
