package fr.codegym.task.task20.task2012;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* 
OutputToConsole
*/
public class Solution {
    public static String greeting = "Bonjour, monde";

    /**
     * OutputToConsole est une classe de base interne pour améliorer ton attention.
     * Un objet OutputToConsole encapsule les informations nécessaires
     * pour afficher la variable [greeting] dans la console.
     * @author CodeGym
     */
    public static class OutputToConsole implements Externalizable {
        private int counter;

        /**
         * @param out Un flux pour l'externalisation
         * @throws java.io.IOException
         */
        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(counter);
        }

        /**
         * @param in Un flux pour la désexternalisation
         * @throws java.io.IOException
         * @throws ClassNotFoundException
         */
        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            counter = in.readInt();
        }

        /**
         * Le constructeur de classe qui définit le champ privé counter.
         */
        public OutputToConsole(int counter) {
            this.counter = counter;
        }

        /**
         * Affiche le message d'accueil « counter » fois.
         */
        public void printMessage() {
            for (int i = 0; i < counter; i++) {
                System.out.println(greeting);
            }
        }
    }

    public static void main(String[] args) {

    }
}
