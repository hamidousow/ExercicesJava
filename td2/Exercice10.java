import java.util.*;

public class Exercice10 {
	public static void main(String args[]) {
		
		
		int prixTotal = 0;
		int positionArticle = 0;
		int[] billets = new int[3];
		int monnaieClient = 0;
		int prixArticle;		
		
		//System.out.print("Saisir prix de l'article " + (positionArticle) + " : " );
		Scanner sc = new Scanner(System.in);		
		
		while(prixArticle != 0) {
			System.out.print("Saisir prix de l'article " + (++positionArticle) + " : " );			
			prixArticle = sc.nextInt();
			prixTotal += prixArticle;			
		}	
		
		System.out.println("prix total : " + prixTotal);
		
		//calcule du reste a rendre 
		System.out.print("Entrer somme donnee par le client : ");
		monnaieClient = sc.nextInt();		
		
		int rest = monnaieClient - prixTotal;	
		System.out.print("Reste a rendre : " + rest);
		
		//detail reste a rendre en 1, 5 et 10
		
		for(int i = 0; i < billets.length; i++) {
			if( rest >= billets[i]) {
				System.out.print((rest/billets[i]) + " fois " + billets[i] + " euros.");
				rest = rest % billets[i];
			}			
		}		
	}
}