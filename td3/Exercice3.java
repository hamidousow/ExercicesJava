import java.util.*;

public class Exercice3 {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Saisir la taille du tableau : ");
		int tailleTab = Integer.parseInt(sc.nextLine());
		
		int[] tab = saisirTableau(tailleTab,sc);
		int somme = calculerSomme(tab);
		int produit = 1;
		
		for(int i = 0; i < tab.length; i++) {
			produit = tab[i] * produit;
		}
		
		System.out.println("La somme est : " + somme);
		System.out.println("Le produit est : " + produit);
		
		int moyenne = somme / tab.length;
		System.out.println("La moyenne est : " + moyenne);		
	}
	
	public static  int[] saisirTableau(int nombreElement,Scanner sc){
		
		int[] elements = new int[nombreElement];
		
		for (int i=0 ; i<elements.length; i++){
			System.out.print(" veuillez entrer l'element["+i+"] = ");
			elements[i]= Integer.parseInt(sc.nextLine());
		}
		
		return elements;
	}
	
	public static int calculerSomme(int [] tab) {
		
		int somme = 0;
		
		for(int i = 0; i < tab.length; i++) {			
			somme = tab[i] + somme;			
		}
		
		return somme;
	}
	
}

