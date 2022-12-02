import java.util.*;

public class Exercice4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("entrez la taille du tableau");
		int[] tab = new int[Integer.parseInt(sc.nextLine())];		
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = ran.nextInt(100);
		}		
		
		System.out.println("entrez un index pour afficher sa valeur");
		
		int inputValue = sc.nextInt();
		
		System.out.print("valeur de l'index : [" + tab[inputValue] + "]");
		
	}
}