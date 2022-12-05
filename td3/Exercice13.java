import java.util.Scanner;

public class Exercice13 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int i;
		int nbre;
		int tmp;
		
		int[] tab = new int[5];
			
		for(i=0;i<tab.length;i++){
			System.out.println("Saisir des nombres : ");
			nbre = Integer.parseInt(sc.nextLine());
			tab[i] = nbre;
		}

		for(i=0;i<tab.length-1;i++){
			if(tab[i] > tab[i+1]){
				tmp = tab[i+1];
				tab[i+1] = tab[i];
				tab[i] = tmp;
			}
		}
		
		for(i=0;i<tab.length;i++){
			System.out.print(" " + tab[i] + " ");
		}
	}
}
