import java.util.*;

public class Exercice7 {
	public static void main(String args[]) {
		System.out.print("Saisir un nombre : ");
		Scanner sc = new Scanner(System.in);
		
		int nombreSaisie = sc.nextInt();
		int somme = 1;
		
		for(int i = 1; i <= nombreSaisie; i++)  {			
			somme *= i;
			if(i == nombreSaisie) {
				System.out.print(i + " = " + somme);
			} else {
				System.out.print( i + " x ");
			}
		}
	}
}