import java.util.*;

public class Exercice10 {
	public static void main(String args[]) {
		System.out.print("Saisir nombre d'elements : ");
		Scanner sc = new Scanner(System.in);
		int nbrElt = sc.nextInt();
		
		int[] tab1 = new int[nbrElt];
		int[] tab2 = new int[nbrElt+1];
		
		Random ran = new Random();
		
		for(int i = 0; i < tab1.length ; i++) {
			tab1[i] = ran.nextInt(10);
			System.out.println(tab1[i]);			
		}
		
		System.out.print("Saisir l'index a modifier : ");
		int index = sc.nextInt();
		
		System.out.print("Saisir la nouvelle valeur de l'index : ");
		int indexValue = sc.nextInt();
		
		for(int j = 0; j < tab1.length ; j++) {
			if(j < index) {
				tab2[j] = tab1[j];
			} else {
				tab2[j+1] = tab1[j];
			}
		}

		tab2[index] = indexValue;
		
		for(int k = 0; k < tab2.length; k++) {
			System.out.print(tab2[k]);
		}		
	}
}