import java.util.*;

public class Exercice4 {
	public static void main(String args[]) {
		//System.out.println("hello world");		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Merci de saisir le nombre de photocopies : ");
		int photocopies = sc.nextInt();
		double facture = 0;		
		
		if(photocopies >= 30) {
			facture = (((photocopies - 30) * 0.08) + (20 * 0.09) + (10 * 0.10)); 
			System.out.print(facture);
			
		} else if(photocopies <= 20) {
			facture = ((photocopies - 10) * 0.09) + (10 * 0.10);
			System.out.print(facture);			
			
		} else if(photocopies <= 10) {			
			facture = (10 * 0.10); 
			System.out.print(facture);
			
		} else if(photocopies < 0) {			
			System.out.print("Erreur, Veuillez saisir un nombre supérieur à 0.");
		}		
	}
}