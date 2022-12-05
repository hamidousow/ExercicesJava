import java.util.*;

	public class Exercice12PlusPlus{
		public static void main(String args[]){
			Scanner sc= new Scanner(System.in);
			System.out.println("Veillez saisir le nb d'elements souhaite ds le tableau : ");
		    int tab[] = TableauUtils.generationTableauAleatoire(Integer.parseInt(sc.nextLine()));
			TableauUtils.afficherTableau(tab);
			System.out.println("Quel est l'index de l'element que vous souhaitez supprimer ?");
			String indexASupprimerString=sc.nextLine();
			int indexASupprimer=Integer.parseInt(indexASupprimerString);
			tab = TableauUtils.supprimer(tab,indexASupprimer);
			TableauUtils.afficherTableau(tab);

	}
	
}