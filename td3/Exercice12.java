import java.util.*;

public class Exercice12 {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		
		
		//remplir le tableau avec des nombre aleatoire 
		System.out.print("Saisir le nombre d'elements : ");
		int nbrElt = sc.nextInt();
		int[] tab = new int[nbrElt];			
		
		Random ran = new Random();
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = ran.nextInt(10);
			System.out.print(tab[i] + ", ");
		}
		
		//supprimer un index au choix
		System.out.print("Saisir l'index de l'element a supprimer : ");
		int deleteIndex = sc.nextInt();
		
		int[] tmpTab = new int[tab.length-1];
		
		for(int j = 0; j <= tab.length-1 ; j++) {
			if(deleteIndex > j) {
				
				tmpTab[j] = tab[j];
				
			} else if (deleteIndex < j) {
				
				tmpTab[j-1] = tab[j];
				
			}
		}
		
		tab = tmpTab;
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + ", ");
		}		
	}
}