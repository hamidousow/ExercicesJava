import java.util.*;

public class Exercice3 {
	
	public static void main (String args[]) {
		
		Scanner sc= new Scanner(System.in);
		int nombre= 0;
		int i = 0;

		System.out.println("saisir un nombre");
		nombre=sc.nextInt();

		while (i<=9) {
			i=i+1;
			System.out.print(nombre+i + " ");
		}
	}
}