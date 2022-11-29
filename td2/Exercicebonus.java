import java.util.*; 
public class Exercicebonus{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print(" Veuillez saisir le nombre d'elements du tableau  : ");
		int nbrElt = sc.nextInt(); 
		System.out.println(" Le contenue du tableau est saisie de maniere aleatoire entre 1 et 20  : ");
		int[] tab = new int[nbrElt];
		int[] tab2 = new int[nbrElt];
		int i = 0;
		for( i=0 ; i<tab.length ; i++) {
			tab[i] = ran.nextInt(20);
		}
		
		Arrays.sort(tab);		
		
		System.out.println(" Avant le tri  : ");
		for ( i = 0;i < tab.length;i++) {
		System.out.println(" [ "+ tab[i] + " ] ");
		}

		for (i = 1;i<tab.length;i++) {
			if (tab[i] != tab[i-1]) {
				tab2[i-1]= tab[i];
			}			
		}
	
		System.out.println(" Apres le tri  : ");
		for ( i = 0 ; i < tab.length ; i++) {
		System.out.print(" [ "+ tab2[i] + " ] ");
		}		
     }
}
