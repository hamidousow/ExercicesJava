import java.util.*;

public class Exercice16 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisier la taille du tableau 1 : ");
		int tailleTableau = Integer.parseInt(sc.nextLine());
		
		int tab [] = TableauUtils.generationTableauAleatoire(tailleTableau);
		TableauUtils.afficherTableau(tab);
	}
	
}