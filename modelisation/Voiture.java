import java.util.*;

public class Voiture {

    private int id;
    private String marque;
    private int vitesse;
    private int puissance;

    public Voiture(String marque, int vitesse, int puissance) {
        this.marque = marque;
        this.vitesse = vitesse;
        this.puissance = puissance;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getMarque() {
        return this.marque;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
    public int getVitesse() {
        return this.vitesse;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
    public int getPuissance() {
        return this.puissance;
    }

    public String toString() {
        return " id = " + this.id + ", marque = " + this.marque + ", vitesse = " + this.vitesse + ", puissance = " + this.puissance + "\n";
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir le nombre de voitures : ");
        int nbr = Integer.parseInt(sc.nextLine());
        Voiture voitures [] = new Voiture [nbr];  

        for(int i = 0; i < voitures.length; i++) {            
            System.out.print("Saisir la marque : ");
            String marque = sc.nextLine();

            System.out.print("Saisir la vitesse : ");
            int vitesse = Integer.parseInt(sc.nextLine());

            System.out.print("Saisir la puissance : ");
            int puissance = Integer.parseInt(sc.nextLine());           

            Voiture voiture = new Voiture(marque, vitesse, puissance);
            voiture.setId(i+1);
            voitures[i] = voiture; 
            System.out.println();           
        }

        for(Voiture voiture : voitures) {
            System.out.print(voiture.toString());
        }

        System.out.print("Le nmbre des voitures est : " + voitures.length);
    }
}