import java.util.*;

public class Exercice13 {
	public static void main(String args[]) {
		
		System.out.print("veuillez saisir le nombre d'element : ");
		Scanner sc = new Scanner(System.in);
		int nbrElt = sc.nextInt();
		
		Random ran = new Random();
		int tab[] = new int[nbrElt];
		
		int tmpVar; 
		
		for(int i = 0 ; i < tab.length ; i++) {
			tab[i] = ran.nextInt(10);
			System.out.print("tab [" + tab[i] + "], ");
		}
		
		for(int i = 0; i < tab.length ; i++) {
			for(int j = 1 ; j < tab.length-1 ; j++) {
				if(tab[j] < tab[i]) {
					tmpVar = tab[j];
					tab[j] = tab[i];
					tab[i] = tmpVar;
				}
			}			
		}
		
		for(int i = 0 ; i < tab.length ; i++) {
			tab[i] = ran.nextInt(10);
			System.out.println("Ordre croissant : [" + tab[i] + "], ");
		}			   
	 
	}
}