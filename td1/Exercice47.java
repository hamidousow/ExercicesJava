import java.util.*;

class Exercice47 {

	public static void main (String args[]) {
		
		int tarif = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez votre age : ");
		int age = sc.nextInt();
		
		System.out.println("Entrez votre experience : ");
		int exp = sc.nextInt();
		
		System.out.println("Entrez vos annees d'anciennete : ");
		int anciennete = sc.nextInt();
		
		System.out.println("Entrez le nombre d'accident : ");
		int nbrAccidents = sc.nextInt();

		System.out.print("Votre profil : \n\t age : " + age + "\n\t experience : " + exp + "\n\t fidelite : " + anciennete + "\n\t nombre d'accident : "  + nbrAccidents);
		
		if(age < 25 && exp <= 2)  {			
			tarif = 1;			
		}		
		
		if((age < 25 && exp > 2) || (age > 25 && exp < 2)) {
			if(nbrAccidents == 0) {
				tarif = 2;
			} else if(nbrAccidents == 1) {
				tarif = 1;
			}
		}
		
		if(age >= 25 && exp > 2)  {			
			if(nbrAccidents == 0) {
				tarif = 3;
			} else if(nbrAccidents == 1) {
				tarif = 2;
			} else if(nbrAccidents == 2) {
				tarif = 1;
			}				
		}
		
		if(anciennete > 5 && tarif > 0) {
			tarif += 1;
		}
		
		if(tarif >= 4) {
			
			System.out.print("\n Tarif bleu ");
			
		} else if (tarif == 3) {
			
			System.out.print("\n Tarif vert ");
			
		} else if (tarif == 2) {
			
			System.out.print("\n Tarif orange ");
			
		} else if (tarif == 1) {
			
			System.out.print("\n Tarif rouge");
			
		} else {
			System.out.print(" \n Refuse");
		}
		
	}
			  
}