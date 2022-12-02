import java.util.*;

public class Exercice7 {
	
	public static void main(String args[]){		
	
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("Saisir la taille du tableau : ");
		
		int[] tab = new int[Integer.parseInt(sc.nextLine())];
		int nbrOccurence = 0;
		
		for(int i = 0; i < tab.length; i++) {					
			tab[i] = ran.nextInt(9);		
		}
		
		System.out.print("Entrer une occurence a rechercher : ");		
		int occurenceRecherchee = Integer.parseInt(sc.nextLine());
		
		for(int i = tab.length-1; i >= 0; i--) {
			if(tab[i] == occurenceRecherchee) {
				System.out.println("Derniere occurence a l'index : " + i);
				nbrOccurence += 1;
				break;
			} 				
		}
		
		if(nbrOccurence == 0) {
			System.out.println("Aucune occurence n'a ete trouvee");
		}
	}
	
}