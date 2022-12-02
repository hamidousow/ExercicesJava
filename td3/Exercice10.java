import java.util.*;

public class Exercice10 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("Saisir la taille du tableau  : "); 
		int[] tab1 = new int[Integer.parseInt(sc.nextLine())];				
		
		for(int i = 0; i < tab1.length; i++) {			
			tab1[i] = ran.nextInt(10);			
			System.out.println("Index [" + i + "] = " + tab1[i]);
			System.out.println();
		}
		
		System.out.print("Saisir l'index a modifier : ");
		int indexAModifie = sc.nextInt();
		
		System.out.print("Saisir la nouvelle valeur de l'index : ");
		int nouvelleValeur = sc.nextInt();		

		tab1[indexAModifie] = nouvelleValeur;
		
		for(int i = 0; i < tab1.length; i++) {
			System.out.println("Index [" + i + "] = " + tab1[i]);
			System.out.println();
			
		}		
	}
}