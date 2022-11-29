import java.util.*;

public class Exercice6 {
	/*public static void main(String args[]) {
		System.out.print("Saisir nombre d'element souhaitee : ");
		Scanner sc = new Scanner(System.in);
		int nbrElement = sc.nextInt();
		int[] tab = new int[nbrElement];
		
		boolean repet = true;
		
		for(int i = 0; i < tab.length; i++) {
			System.out.println("Saisir valeur des element");
			int value = sc.nextInt();		
		}
		
		System.out.println("Saisir l'occurence à verifier : ");
		int occ = sc.nextInt();
		for(int j = tab.length; j <= 0; j++) {
			if(tab[j] == occ) {
				System.out.print(j);
			}
		}
	}*/
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print(" Veuillez saisir le nombre d'elements du tableau  : ");
		int nbrElt = sc.nextInt(); 
		int[] tab = new int[nbrElt];
		
		for (int i = 0;i <=tab.length-1;i++){
			System.out.print(" Veuillez saisir l'element "+i+" du tableau : ");
			tab[i]= sc.nextInt();
			
			
		}
		
		System.out.print(" Quelle occurence du tableau souhaitez vous rechercher (pas l'index) : ");
		int elt = sc.nextInt();		
		
		int position = -1;
		for (int j = tab.length-1; j >=0; j--) {
			if (elt == tab[j]){				
				position = j;				
			}		
		}
		
		if(position >= 0){
			System.out.println(" la premiere occurence de  " + elt + " a ete trouve en position : "+position+"");
		}else{
			System.out.println(" aucune occurence de "+ elt);
		}
		
     }
}