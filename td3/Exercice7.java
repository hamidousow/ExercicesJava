import java.util.*;

public class Exercice7 {
	
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
		for (int j = tab.length-1; j >=0;j--){
			if (elt == tab[j]){
				
				position = j;
				break;
			}		
		}
		
		if(position >= 0){
			System.out.println(" la derniere occurence de  " + elt + " a ete trouve en position : "+position+"");
		}else{
			System.out.println(" aucune occurence de "+ elt);
		}
		
     }
	
}