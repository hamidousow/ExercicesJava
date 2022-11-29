import java.util.*;

public class Exercice1 {
	public static void main(String[] args) {
		System.out.println("Entrez un nombre entre 1 et 3");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		while(input >= 1 && input <= 3) {
			System.out.println(input);	
			break;
		}	
	}
}