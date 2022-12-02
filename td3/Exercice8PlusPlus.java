import java.util.*;

public class Exercice8PlusPlus{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir le nombre d'element a inclure dans le tableau : ");
		int nombreElements = Integer.parseInt(sc.nextLine());
		
		int element;
		int nombreOccurence = 0;
		
		int elements[] = TableauUtils.generationTableauAleatoire(nombreElements,0,nombreElements-5);
		TableauUtils.afficherTableau(elements);
		System.out.print("Quel occurence de l'element a rechercher ? : ");
		element = sc.nextInt();
		nombreOccurence = TableauUtils.calculerNombreOccurences(element,elements);
		System.out.print("Le nombre d'occurences l'element " + element + " est " + nombreOccurence);
			
	}
	
	
}