import java.util.*;

public class Exercice4 {
	public static void main(String args[]) {
		int[] tab = new int[3];
		tab[0] = 10;
		tab[1] = 20;
		tab[2] = 30;
		
		System.out.println("entrez un index pour l'afficher");
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		
		System.out.print("valeur de l'index : [" + tab[inputValue] + "]");
		
	}
}