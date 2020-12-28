package fr.codegym.task.task05.task0512;

/* 
Créer une classe Cercle
*/

public class Cercle {
    //écris ton code ici
    int centreX, centreY, rayon, largeur ,couleur;



    public void initialiser(int centreX, int centreY, int rayon){
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
    }

    public void initialiser(int centreX, int centreY, int rayon, int largeur){
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
        this.largeur = largeur;
    }

    public void initialiser(int centreX, int centreY, int rayon, int largeur, int couleur){
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
        this.largeur = largeur;
        this.couleur = couleur;
    }

    public static void main(String[] args) {

    }
}
