import java.util.Scanner;

public class Exercice13 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisir la taille du tableau : ");
		int tailleTableau = Integer.parseInt(sc.nextLine());
		
		int[] tab = TableauUtils.generationAleatoire(tailleTableau);
		TableauUtils.afficher(tab);
		
		TableauUtils.trier(tab, true);
		
		TableauUtils.afficher(tab);		
	}
}
