import java.util.*;

public class Exercice12 {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Saisir le nombre d'elements : ");
		int tab [] = TableauUtils.saisirTableau(Integer.parseInt(sc.nextLine()), sc);			
		TableauUtils.afficherTableau(tab);
		
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