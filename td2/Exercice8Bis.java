import java.util.*;

public class Exercice8Bis {
	public static void main(String args[]) {		
			
		Scanner sc = new Scanner(System.in);		
		
		int maxNumber = 0;
		int compt = 0;
		int range = 0;
		
		for(int i = 0 ; i <= 19 ; i++) {
			
			System.out.println("Saisir le nombre du rang : " + (i+1));			
			
			int newNumber = sc.nextInt();
			compt = compt + 1;
			
			if(newNumber > maxNumber) {
				maxNumber = newNumber;
				range = i;
			}			
		}
		
		System.out.println("Le nombre max est : " + maxNumber + " au rang : " + range);
		
	}
}