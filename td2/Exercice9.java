import java.util.*;

public class Exercice9 {
	public static void main(String args[]) {
		 
		Scanner sc = new Scanner(System.in);		
		
		int maxNumber = 0;			
		int input;
		int i = 1;
		int indexMax = 0;
		
		do {	
			System.out.print("entrez le nombre numero " + i + " : ");
			input = sc.nextInt();
		
			if(input > maxNumber) {
				maxNumber = input;	
				indexMax = i;
			}	
			i++;
		} while(input != 0);
		
		System.out.println("Le nombre max est : " + maxNumber + " au rang : " + indexMax);
		
	}
}