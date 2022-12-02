import java.util.*;
public class Exercice4{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("donner le nombre d'éléments : ");
		int nbrElement = Integer.parseInt(sc.nextLine());
		
		int[] tab = saisirTableau(nbrElement,sc);
		
		System.out.print("saisir l'index de l'élément à afficher : ");
		int indexSaisie = Integer.parseInt(sc.nextLine());
		
		System.out.println("la valeur de l'index : "+indexSaisie+" est " +tab[indexSaisie]);
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
