import java.util.*;

public class Exercice4_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float scoreMinimal = 12.5f;
		float maxSuffrage = 50.0f;
		float scoreTotal;		
		
		float[] tabCandidat = new float[4];
		int i;
		
		
		for(i = 0; i < tabCandidat.length ; i++) {
			
			System.out.println("saisir score du candidat " + (i+1));
			
			tabCandidat[i] = sc.nextFloat();
			System.out.println("Score candidat " + (i+1) + " : " + tabCandidat[i]);
			
			if(tabCandidat[0] >= maxSuffrage) {
				System.out.println("Candidat 1 remporte les elections.");
				break;
			} 
		
			if(tabCandidat[0] < scoreMinimal) {
				System.out.println("Candidat 1 ne passe pas au second tour.");
				break;
			}
							
		}
		
		if(tabCandidat[0] > tabCandidat[1] && tabCandidat[0] > tabCandidat[2]) {
			System.out.println("Candidat 1 passe au ballotage favorable.");
		} else {
			
		}
	}
}