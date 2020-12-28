package fr.codegym.task.task15.task1502;

/* 
POO : Héritage des animaux
*/

public class Solution {
    // Ajoute les classes Goose et Dragon ici

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "comme un dinosaure";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "comme un chat";
        }
    }
    public static class Goose extends SmallAnimal {
        public String getSize() {
            return String.format("Une oie est petite, %s", super.getSize() );
        }
    }

    public static class Dragon extends BigAnimal  {
        public String getSize()
        {
            return String.format("Un dragon est grand, %s", super.getSize() );
        }
    }


}
