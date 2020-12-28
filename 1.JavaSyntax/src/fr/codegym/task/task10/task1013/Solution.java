package fr.codegym.task.task10.task1013;

/* 
Constructeurs de la classe Humain
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Humain {
        // Écris tes variables et constructeurs ici
        private int a;
        private int b;
        private String c;
        private String d;
        private boolean e;
        private char f;

        public Humain(char f) {
            this.f = f;
            this.a = 0;
            this.b = 0;
            this.c = "f";
            this.d = "f";
            this.e = false;
        }

        public Humain(boolean e) {
            this.e = e;
            this.f = f;
            this.a = 0;
            this.b = 0;
            this.c = "f";
            this.d = "f";
        }

        public Humain(String c) {
            this.c = c;
            this.f = f;
            this.a = 0;
            this.b = 0;
            this.d = "f";
            this.e = false;
        }

        public Humain(int a) {
            this.a = a;
            this.f = f;
            this.b = 0;
            this.c = "f";
            this.d = "f";
            this.e = false;
        }

        public Humain(int a, int b, String c, String d, boolean e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = 'f';
        }

        public Humain(int a, int b, String c, String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.f = 'f';
            this.e = false;
        }

        public Humain(int a, int b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;

            this.f = 'f';
            this.d = "f";
            this.e = false;
        }

        public Humain(int a, int b) {
            this.a = a;
            this.b = b;

            this.f = 'f';
            this.c = "f";
            this.d = "f";
            this.e = false;
        }

        public Humain(boolean e, char f) {
            this.e = e;
            this.f = f;
            this.a = 0;
            this.b = 0;
            this.c = "f";
            this.d = "f";
        }

        public Humain(int a, int b, String c, String d, boolean e, char f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
}
