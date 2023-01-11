import java.util.*;

public class Livre {

    private int id;
    private String titre;
    private String auteur;
    private double prix;    

    public Livre() {  

    }

    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return this.prix;
    }

    public String toString() {
        return "Le prix du livre " + this.titre + "de l'auteur " + this.id + " est : " + this.prix + " DH";
    }  

    public static void main(String args[]) {        

        Scanner sc = new Scanner(System.in);        

        System.out.print("Entrer le nombre de livre que vous souhaitez publier :  ");
        int nbrLivres = sc.nextInt();
        
        Livre [] livres = new Livre[nbrLivres]; 

        for(int i = 0; i < livres.length; i++) {
            System.out.print("Donner le titre du livre n" + (i+1) + ": ");
            String titre = sc.nextLine();
            System.out.println();
            System.out.print("Donner l'auteur du livre n" + (i+1) + ": ");
            String auteur = sc.nextLine();
            System.out.print("Donner le prix du livre n " + (i+1) + ": ");
            double prix = sc.nextDouble();
            Livre newLivre = new Livre(titre, auteur, prix);
            newLivre.id = i +1;
            livres[i] = newLivre;
        }

        Livre numeroLivre = new Livre();

        
        System.out.println();                   

        System.out.println("Nombre de livres est de " + livres.length);  
        for(Livre livre : livres) {
            System.out.print(livre.toString());
        }           
    }
}

