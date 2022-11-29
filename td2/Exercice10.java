import java.util.*;

public class Exercice10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int sommeTotale = 0;
		int remiseMonnaie = 0;
		int cpt10 = 0;
		int cpt5 = 0;
		int cpt1 = 0;
		int prixArticle;
		int reste;
		int sommePayee;
		
		do {
			System.out.print("scanner les articles : ");
			prixArticle = sc.nextInt();
			sommeTotale = sommeTotale + prixArticle;			
		} while(prixArticle != 0);
		
		System.out.print("Somme a payer : " + sommeTotale + "\n , saisir la somme payee par le client : ");
		sommePayee = sc.nextInt();
		
		reste = sommePayee - sommeTotale;
		System.out.print("Monnaie a rendre : " + reste + "\n");

		if(reste >= 10) {
			cpt10 = reste / 10;
			reste = reste % 10;
		}
		
		if(reste >= 5 || reste < 10) {
			cpt5 = reste / 5;
			reste = reste % 5;
		}
		
		if(reste >= 0) {
			cpt1 = reste * 1;
		}		
		
		System.out.println("Remise : \n \t" + cpt10 + " x 10 euro \n \t" + 
							cpt5 + " x 5 euro \n\t" + 
							cpt1 + " x 1 euro");
	}
}