/**
*
* Ceci est le programme pour l'exercice 5 du TD3
*
* Ecrire un algorithme permettant  de chercher toutes 
* les occurrences d’un  élément  dans un tableau.
*
*
*/

import java.util.*;

public class Exercice5PlusPlus{
	
	public static void main(String[] args){
		

		Scanner scanner = new Scanner(System.in);
			
		int tailleTab;
		int elementRechercher;
		String message;
			
		message = "Occurence trouver a l'index : ";			
		System.out.println("Veuillez saisir le nombre d'elements voulu :");			
		tailleTab= Integer.parseInt(scanner.nextLine());
		int elements[] = TableauUtils.generationTableauAleatoire(tailleTab,0,200);		
		TableauUtils.afficherTableau(elements);
		System.out.println("Veuillez saisir l'element a chercher : ");
		elementRechercher= Integer.parseInt(scanner.nextLine());
			
		int index[] = TableauUtils.chercherToutesOccurences(elementRechercher,elements);	
		
		if(index.length>0){
			System.out.print("Resultats : ");
			for(int i=0;i<index.length;i++){
				System.out.print(index[i]);
				if(i!=index.length-1){
					System.out.print(",\t");
				}	
			}	
		}else{
		    System.out.println("Aucune occurence trouvee");
		}	
	}
	
	
	
	
}
