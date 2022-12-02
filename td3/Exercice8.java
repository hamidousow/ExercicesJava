import java.util.*;

public class Exercice8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();		
		
		System.out.print("Saisir la taille du tableau  : "); 
		int[] tab = new int[Integer.parseInt(sc.nextLine())];
		int cpt = 0;
		int nbrOccurence = 0;
		
		
		System.out.print("Saisir l'occurence a rechercher: ");
		int occurenceRecherchee = sc.nextInt();
		
		for(int i = 0; i < tab.length; i++) {					
			tab[i] = ran.nextInt(9);		
		}
		
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] == occurenceRecherchee) {
				System.out.println("Occurence a l'index : " + i);
				nbrOccurence += 1;
			} 				
		}	
		
		if(nbrOccurence == 0) {
			System.out.println("Aucune occurence n'a ete trouvee");
		} else {
			System.out.println("Nombre d'occurence trouvee : " + nbrOccurence);
		}				
	}
}