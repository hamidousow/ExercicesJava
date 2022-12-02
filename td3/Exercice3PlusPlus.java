import java.util.*;

public class Exercice3PlusPlus {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisir la taille du tableau : ");
		int taille = Integer.parseInt(sc.nextLine());
		int[] tab = TableauUtils.saisirTableau(taille,sc);
		int somme   = TableauUtils.sommeTableau(tab);
		int produit = TableauUtils.produitTableau(tab);
		int moyenne = TableauUtils.moyenneTableau(tab);
		System.out.println("La somme est : " + somme);
		System.out.println("Le produit est : " + produit);
		System.out.println("La moyenne est : " + moyenne);	
	}
}
