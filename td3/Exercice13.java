import java.util.*;

public class Exercice13 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisier la taille du tableau : ");
		int tailleTableau = Integer.parseInt(sc.nextLine());
		
		System.out.print("Saisier la borne min : ");
		int borneMin = Integer.parseInt(sc.nextLine());
		
		System.out.print("Saisier la borne max : ");
		int borneMax = Integer.parseInt(sc.nextLine());	
		
		int tab [] = TableauUtils.generationTableauAleatoire(tailleTableau, borneMin, borneMax);
		
		TableauUtils.filtreParOrdreCroissant(tab);
		TableauUtils.afficherTableau(tab);
	}
	
}