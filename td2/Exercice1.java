import java.util.*;

public class Exercice1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			System.out.println("Entrez un nombre entre 1 et 3");
			input = Integer.parseInt(sc.nextLine());
			if(input < 1 || input > 3) {
				System.out.println("Nombre incorrect, saisir un nombre entre 1 et 3");
			} else {
				System.out.println("Saisie correcte, votre saisie : " + input);
				break;
			}
			
		} while(true); 
	}
}