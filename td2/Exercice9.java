import java.util.*;

public class Exercice9 {
	public static void main(String args[]) {
		 
		Scanner sc = new Scanner(System.in);		
		
		int maxNumber = 0;		
		int range = 0;	
		
		System.out.println("entrer un nombre : ");
		int input = sc.nextInt();		
		
		while(input != 0) {	
			System.out.println("entrer un nombre : ");
			input = sc.nextInt();
			range = range + 1;
		
			if(input > maxNumber) {
				maxNumber = input;										
			}							
		}			
		
		System.out.println("Le nombre max est : " + maxNumber + " au rang : " + range);
		
	}
}