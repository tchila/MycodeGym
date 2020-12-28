package fr.codegym.task.task20.task2011;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
Externalizable pour des appartements
*/
public class Solution  {


    public static class Apartment implements Externalizable {

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String)in.readObject();
            year = in.readInt();
        }

        private String address;
        private int year;

        /**
         * Constructeur public obligatoire sans argument.
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Imprime les champs utilisés pour les tests !
         */
        public String toString() {
            return("Adresse : " + address + "\n" + "Année : " + year);
        }
    }

    public static void main(String[] args) {

    }
}
