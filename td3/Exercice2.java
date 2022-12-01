import java.util.*;

public class Exercice2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nbrElements;
	
		System.out.print("Saisir le nombre d'elements : ");
		
		
		nbrElements = sc.nextInt();
		
		int[] tabElement = new int[nbrElements];
		Random ran = new Random();		
		
		for(int i = 0; i < tabElement.length; i++) {
			tabElement[i] = ran.nextInt(100);
			System.out.println("element numero " +i+ " : [" + tabElement[i] + "]");				
		}	
		
		System.out.println("Saisir un index et afficher sa valeur");
		int indexValue = sc.nextInt();		 
		System.out.println("valeur index " + tabElement[indexValue]);				
	}		
}