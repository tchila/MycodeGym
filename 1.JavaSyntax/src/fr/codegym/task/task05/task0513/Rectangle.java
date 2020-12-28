package fr.codegym.task.task05.task0513;

/* 
Assemblons un rectangle
*/

public class Rectangle {
    //écris ton code ici
    int sommet, gauche, largeur , hauteur;



    public void initialiser(int sommet, int gauche, int largeur, int hauteur){
        this.sommet = sommet;
        this.gauche = gauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
 public void initialiser(int sommet, int gauche){
        this.sommet = sommet;
        this.gauche = gauche;
        this.largeur = 0;
        this.hauteur = 0;
    }

    public void initialiser(int sommet, int gauche, int largeur){
        this.sommet = sommet;
        this.gauche = gauche;
        this.largeur = largeur;
        this.hauteur = largeur;
    }

    public void initialiser(Rectangle rectangle){
        this.sommet = rectangle.sommet;
        this.gauche = rectangle.gauche;
        this.largeur = rectangle.largeur;
        this.hauteur = rectangle.hauteur;
    }
    public static void main(String[] args) {

    }
}
