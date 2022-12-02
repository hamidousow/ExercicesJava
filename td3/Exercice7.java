import java.util.*;

public class Exercice7{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quel est la taille du tableau : ");
		int taille = Integer.parseInt(sc.nextLine());
		int elements[] = saisirTableau(taille, sc);
		int element;
		int occurence = 0;
		int position = 0;
		int i;
		
		System.out.print("Quel element a rechercher ? : ");
		element = Integer.parseInt(sc.nextLine());
		
		for(i = (elements.length - 1); i > 0; i--){
			
			if(elements[i] == element && occurence == 0){
				position = i;
				break;
			}
		}
		System.out.print("La derniere occurence de l'element " + element + " a ete trouve a l'index " + position);
	}
	
	public static  int[] saisirTableau(int nombreElement,Scanner sc){
			int[] elements = new int[nombreElement];
			for (int i=0 ; i<elements.length; i++){
				System.out.print(" veuillez entrer l'element["+i+"] = ");
				elements[i]= Integer.parseInt(sc.nextLine());
			}
			return elements;
		}
}