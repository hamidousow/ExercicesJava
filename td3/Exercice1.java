import java.util.*;

public class Exercice1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int somme = 0;
		
		System.out.println("Saisir la taille du tableau : ");
		int [] tab = new int[Integer.parseInt(sc.nextLine())];	
		
		for(int i = 0; i < tab.length; i++) {
			System.out.print("Saisir l'element " + i + " : ");
			tab[i] = Integer.parseInt(sc.nextLine());
			somme += tab[i];	
		}
		
		System.out.print(somme);
	}
}