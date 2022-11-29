import java.util.*;

public class Exercice9 {
	public static void main(String args[]) {
		System.out.print("Saisir nombre d'elements : ");
		Scanner sc = new Scanner(System.in);
		int nbrElt = sc.nextInt();
		
		int[] tab1 = new int[nbrElt];
		Random ran = new Random();		
		
		for(int i = 0; i < tab1.length; i++) {			
			tab1[i] = ran.nextInt(10);			
			System.out.println("index" + i + " = " + tab1[i]);
		}	
		
		System.out.print("Saisir nouvel element a ajouter a la fin du tableau : ");
		int nvlElement = sc.nextInt();
		
		int[] newTab = new int[tab1.length + 1];
		
		for(int j = 0; j < newTab.length-1; j++) {
			newTab[j] = tab1[j];
		}
		
		newTab[nbrElt] = nvlElement;	
		tab1 = newTab;
		newTab = null;
		
		for(int i = 0; i < tab1.length; i++) {
			System.out.println(tab1[i]);
		}
	}
}