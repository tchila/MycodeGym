package fr.codegym.task.task05.task0519;

/* 
On tourne en rond, là
*/


public class Cercle {
    //écris ton code ici

    int centreX, centreY, rayon, largeur ,couleur;



    public Cercle(int centreX, int centreY, int rayon){
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
    }

    public Cercle(int centreX, int centreY, int rayon, int largeur){
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
        this.largeur = largeur;
    }

    public Cercle(int centreX, int centreY, int rayon, int largeur, int couleur){
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
        this.largeur = largeur;
        this.couleur = couleur;
    }

    public static void main(String[] args) {

    }
}
