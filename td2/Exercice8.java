import java.util.*;

public class Exercice8 {
	
	public static void main(String args[]) {		
			
		Scanner sc = new Scanner(System.in);		
		
		int maxNumber = 0;
		
		for(int i = 0 ; i <= 19 ; i++) {
			
			System.out.println("Saisir le " + i + " un nombre:" );	
			
			int newNumber = sc.nextInt();			
			if(newNumber > maxNumber) {
				maxNumber = newNumber;
			}			
		}
		
		System.out.print("Le nombre max est : " + maxNumber);
	}
}