import java.util.*;

public class Exercice8 {
	
	public static void main(String args[]) {		
			
		Scanner sc = new Scanner(System.in);		
		
		int maxNumber = 0;
		int newNumber;
		
		for(int i = 1; i <= 20 ; i++) {
			
			System.out.print("Entrez le nombre numero " + i + " : " );	
			
			newNumber = sc.nextInt();			
			if(newNumber > maxNumber) {
				maxNumber = newNumber;
			}			
		}
		
		System.out.print("Le nombre max est : " + maxNumber);
	}
}