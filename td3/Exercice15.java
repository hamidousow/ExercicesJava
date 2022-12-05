import java.util.Scanner;

public class Exercice15 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir la taille du tableau A : ");
		int tailleTableauA = Integer.parseInt(sc.nextLine());
		int [] tabA = TableauUtils.generationAleatoire(tailleTableauA);
		
		System.out.print("Saisir la taille du tableau B : ");
		int tailleTableauB = Integer.parseInt(sc.nextLine());		
		int [] tabB = TableauUtils.generationAleatoire(tailleTableauB);
		
		
		TableauUtils.afficher(tabA);
		TableauUtils.afficher(tabB);
		
		int[] tabFusion = TableauUtils.fusion(tabA, tabB);
		
		TableauUtils.afficher(tabFusion);	
	}
}