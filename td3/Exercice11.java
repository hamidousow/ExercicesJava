import java.util.*;

public class Exercice11 {
	public static void main (String args []) {

		int nbrChevaux;
		int nbrChevauxMisee;
		int factReste;
		int factTotal;
		int factChevauxCourse;
		Scanner sc = new Scanner(System.in);
		
		do {

			System.out.print("Combien de chevaux sont dans la partie ? ");			
			nbrChevaux = sc.nextInt();
			System.out.print("Sur combien de chevaux voulez vous miser ? ");
			nbrChevauxMisee = sc.nextInt();

		} while(nbrChevaux > nbrChevauxMisee);

		int resteChevaux = nbrChevaux - nbrChevauxMisee;
		factReste = factoriel(reste);
		factTotal = factoriel(nbrChevaux);
		factChevauxCourse = factoriel(nbrChevauxMisee);

	}

	
}