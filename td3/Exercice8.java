import java.util.*;

public class Exercice8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print(" Veuillez saisir le nombre d'elements du tableau  : ");
		int nbrElt = sc.nextInt(); 
		int[] tab = new int[nbrElt];
		int cpt = 0;
		int i = 0;
		int j = 0;
		
		for (; i <=tab.length-1 ; i++){
			System.out.print(" Veuillez saisir l'element " + i + " du tableau : ");
			tab[i]= sc.nextInt();
		}
		
		System.out.print("Saisir l'occurence à verifier : ");
		int occ = sc.nextInt();
		
		for(;j< tab.length-1; j++) {
			if(tab[j] == occ) {
				cpt = cpt + 1;
			} else {
				System.out.println("Aucune occurence de " + occ + " n'a ete trouvee");
				break;
			}
		}		
		
		System.out.print("Nombre d'apparaion dans le tableau : " + cpt);
		
				
	}
}