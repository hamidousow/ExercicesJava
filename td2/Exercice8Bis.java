import java.util.*;

public class Exercice8Bis {
	public static void main(String args[]) {		
			
		Scanner sc = new Scanner(System.in);		
		
		int maxNumber = 0;
		int compt = 0;
		int range = 0;
		int newNumber;
		
		for(int i = 1 ; i <= 20 ; i++) {
			
			System.out.print("Saisir le nombre numero " + i + " : ");			
			
			newNumber = sc.nextInt();
			compt = compt + 1;
			
			if(newNumber > maxNumber) {
				maxNumber = newNumber;
				range = i;
			}			
		}
		
		System.out.println("Le nombre max est : " + maxNumber + " au rang : " + range);		
	}
}