package fr.codegym.task.task15.task1505;

import java.util.ArrayList;
import java.util.List;

/* 
POO : Corriger les problèmes d'héritage
*/

public class Solution {
    public static interface LivingPart {
        Object containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            return  "Yes";
        }

        public String toString() {
            return "Yes".equals(containsBones()) ? name + " contient des os" : name + " ne contient pas d'os";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones() {
            if( "Yes".equals(super.containsBones())&& !isArtificial)
                return "Yes";
            else
                return  "No";
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        System.out.println(new BodyPart("Main").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Main"));
        bodyParts.add(new BodyPart("Jambe"));
        bodyParts.add(new BodyPart("Tête"));
        bodyParts.add(new BodyPart("Corps"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Pouce", true));
        fingers.add(new Finger("Index", true));
        fingers.add(new Finger("Majeur", true));
        fingers.add(new Finger("Annulaire", false));
        fingers.add(new Finger("Auriculaire", true));
        System.out.println(fingers.toString());
    }
}

