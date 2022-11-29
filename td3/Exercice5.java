import java.util.*;

public class Exercice5 {
	public static void main(String args[]) {
		System.out.print("Entrez nombre d'elements : ");
		Scanner sc = new Scanner(System.in);
		int nbrElement = sc.nextInt();
		int[] tab = new int[nbrElement];
		//int occ = " ";
		
		for(int i = 0; i < tab.length; i++) {
			System.out.print("Entrez valeur d'elements " + tab[i] + " : ");
			int value = sc.nextInt();			
			tab[i] = value;
			
			for(int j = 0; j < tab.length; j++) {
				if(tab[j] == tab[i]) {
					System.out.println("occurence aux index : " + j);		
				}			
			}		
		}
	}
}