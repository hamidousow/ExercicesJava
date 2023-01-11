import java.util.*;

public class Rectangle {

    private double longueur;
    private double largeur;
    private double aire;
    private double perimetre;

    public Rectangle() {

    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public double calcPerimetre() {
        this.perimetre = (this.longueur + this.largeur) * 2;
        return perimetre;
    }

    public double calcAire() {
        this.aire = this.longueur * this.largeur;
        return aire;
    }

    public boolean isCarre() {
        if(this.longueur == this.largeur) {
            return true;
        }
        return false;
    }

    public String toString() {

        String isCarreToString = isCarre() ? "C'est un carre" : "Ce n'est pas un carre";

        return "Longueur: [" + this.longueur + "] - Largeur: [" + this.largeur + "] - Perimetre: [" + this.perimetre + "] - Aire: [" + this.aire + "] - " + isCarreToString;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir le nombre d'elements : ");
        int nbr = sc.nextInt();

        Rectangle rectangles [] = new Rectangle[nbr];

        for(int i = 0; i < rectangles.length; i++) {            
            System.out.print("  Rectangle " + (i+1) + " : ");
            System.out.println();
            System.out.print("\t\tSaisir la longueur du rectangle : ");
            double longueur = sc.nextDouble();

            System.out.print("\t\tSaisir la largeur du rectangle : ");
            double largeur = sc.nextDouble();
            Rectangle rectangle = new Rectangle(longueur ,largeur);
            rectangles[i] = rectangle;
            System.out.println();
        }

        for(Rectangle rectangle : rectangles) {
            rectangle.calcPerimetre();
            rectangle.calcAire();
            rectangle.isCarre();
            System.out.print(rectangle.toString());
            System.out.println();
        }        
    }
}