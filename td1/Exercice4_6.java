import java.util.*;

 public class Exercice4_6 {

	public static void main(String args[]) {
		
		Scanner scDouble = new Scanner(System.in);
		
		System.out.println("Entrez le score du candidat A: "); 
			double candidatA = scDouble.nextDouble();
			
		System.out.println("Entrez le score du candidat B: ");
			double candidatB = scDouble.nextDouble();
		
		System.out.println("Entrez le score du candidat C: ");
			double candidatC = scDouble.nextDouble();
		
		System.out.println("Entrez le score du candidat D: ");
			double candidatD = scDouble.nextDouble();
 
	if ((candidatA + candidatB + candidatC + candidatD) != 100) {
		System.out.println("Vous n'avez pas saisi(e) un ensemble de valeurs valides.");
		System.exit(0);
	}
		
		if (candidatA > 50) {
			
			System.out.println("Le candidat A est elu pour le prochain tour.");
		} else if (candidatA < 12.5 
		            || (candidatB > 50 || candidatC > 50 || candidatD > 50) ) { 
		
			System.out.println("Le candidat A est battu.");
		} else if (candidatA >= 12.5 && candidatA > candidatB && candidatA > candidatC && candidatA > candidatD) {
			
			System.out.println("Le candidat est en ballotage favorable.");
		} else if (candidatA >= 12.5 && candidatA <50 && (candidatA < candidatB || candidatA < candidatC || candidatA < candidatD)) {
			
		 System.out.println("Le candidat A est en ballotage defavorable.");
		}
	}