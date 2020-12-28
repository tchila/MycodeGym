package fr.codegym.task.task05.task0523;

/* 
Constructeur
*/

public class Cercle {
    public Couleur couleur;

    public static void main(String[] args) {
        Cercle cercle = new Cercle();
        cercle.couleur.setDescription("Rouge");
        System.out.println(cercle.couleur.getDescription());
    }

    public  Cercle() {
        couleur = new Couleur();
    }

    public class Couleur {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
