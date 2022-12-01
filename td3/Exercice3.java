import java.util.*;

public class Exercice3 {
	public static void main(String args[]) {	
		
		int somme = 0;
		int produit = 1;
		
		System.out.print("Entreez nombre d'elements : ");
		Scanner sc = new Scanner(System.in);
		int nbrElement = sc.nextInt();
		int[] tabNumber = new int[nbrElement];
		
		
		for(int i = 0; i < tabNumber.length; i++) {
			System.out.print("Veuillez saisir de l'element [" + i + "] : ");
			tabNumber[i] = sc.nextInt();
			somme = tabNumber[i] + somme;
			produit = tabNumber[i] * produit;
		}
		
		System.out.println("La somme est : " + somme);
		System.out.println("Le produit est : " + produit);
		
		int moyenne = somme / nbrElement;
		System.out.println("La moyenne est : " + moyenne);		
	}
}