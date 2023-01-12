import java.util.Scanner;

public class Exercice14PlusPlus {
		public static void main(String args[]){
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Veillez saisir le nb d'elements souhaite ds le tableau : ");
		    int tab[] = TableauUtils.generationTableauAleatoire(Integer.parseInt(sc.nextLine()));
			TableauUtils.afficherTableau(tab);
			tab = TableauUtils.trier(tab,false);
			TableauUtils.afficherTableau(tab);
			
	}
}
