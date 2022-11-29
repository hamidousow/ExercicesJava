import java.util.*;

public class Exercice5 {
	public static void main(String args[]) {
	
		System.out.println("Sasir un nombre");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("table de " + number);
		
		for(int i = 1; i <= 10; i++) {			
			System.out.println(number + " x " + i + " = " + (number * i));
		}	
	}
}