import java.util.*;

public class Exercice2{
	public static void main(String args[]){
		int taille;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Veuillez saisir la taille du tableau : ");
		taille = Integer.parseInt(sc.nextLine());
		
		int elements[] = saisirTableau(taille,sc);

		
		for(int j = 0;j < elements.length;j++){
			System.out.print(elements[j]+"\t");
		}
		
		
		
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