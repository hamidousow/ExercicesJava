import java.util.*;

public class Exercice3 {
	public static void main(String[] args) {
		System.out.println("Veuillez saisir un nombre de depart");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("["+ ++number + "]" );			
		}
	}
}