import java.util.*;

public class Exercice6PlusPlus{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir le nombre d'element a inclure dans le tableau : ");
		int nombreElements = Integer.parseInt(sc.nextLine());
		
		int element;
		int occurence = 0;
		int position = 0;
		
		int elements[] = TableauUtils.generationTableauAleatoire(nombreElements,0,nombreElements-5);
		TableauUtils.afficherTableau(elements);
		System.out.print("Quel occurence de l'element a rechercher ? : ");
		element = sc.nextInt();
		position = TableauUtils.chercherPremiereOccurence(element,elements);
		if(position>=0){
		    System.out.print("La premiere occurence de l'element " + element + " a ete trouve a la position " + position);
		}else{
			System.out.print("Aucune occurence de l'element " + element + " n'a ete trouvee");
		}	
	}
	
	
}