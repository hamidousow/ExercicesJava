import java.util.*;

public class Exercice9 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir la taille du tableau  : "); 
		int[] tab1 = new int[Integer.parseInt(sc.nextLine())];
		
		Random ran = new Random();		
		
		for(int i = 0; i < tab1.length; i++) {			
			tab1[i] = ran.nextInt(10);			
			System.out.println("index : " + i + " = " + tab1[i]);
		}	
		
		System.out.print("Saisir nouvel element a ajouter a la fin du tableau : ");
		int nvlElement = Integer.parseInt(sc.nextLine());
		
		int[] newTab = new int[tab1.length + 1];
		
		for(int i = 0; i < newTab.length-1; i++) {
			newTab[i] = tab1[i];
		}
		
		newTab[tab1.length] = nvlElement;	
		tab1 = newTab;
		newTab = null;
		
		for(int i = 0; i < tab1.length; i++) {
			System.out.println("Element "+ i + " : [ " + tab1[i] + " ]");
		}
	}
}