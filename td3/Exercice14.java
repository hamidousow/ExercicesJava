<<<<<<< HEAD
import java.util.*;

public class Exercice14 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisier la taille du tableau : ");
		int tailleTableau = Integer.parseInt(sc.nextLine());
		
		System.out.print("Saisier la borne min : ");
		int borneMin = Integer.parseInt(sc.nextLine());
		
		System.out.print("Saisier la borne max : ");
		int borneMax = Integer.parseInt(sc.nextLine());	
		
		int tab [] = TableauUtils.generationTableauAleatoire(tailleTableau, borneMin, borneMax);
		
		TableauUtils.filtreParOrdreDecroissant(tab);
		TableauUtils.afficherTableau(tab);
	}
	
=======
import java.util.Scanner;

public class Exercice14 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisir la taille du tableau : ");
		int tailleTableau = Integer.parseInt(sc.nextLine());
		
		int[] tab = TableauUtils.generationAleatoire(tailleTableau);
		TableauUtils.afficher(tab);
		
		TableauUtils.trier(tab, false);
		
		TableauUtils.afficher(tab);		
	}
>>>>>>> 4d9e668b6e6cd1cc2fc97bf621dbabf830def0bc
}