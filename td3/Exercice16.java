import java.util.*;

public class Exercice16 {

	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Saisir le nombre de lignes du tableau : ");
		int nbrLignes = Integer.parseInt(sc.nextLine());
		
		System.out.print("Saisir le nombre de colonnes du tableau : ");
		int nbrColonnes = Integer.parseInt(sc.nextLine());
		
		int [][] tab = TableauUtils.generationAleatoire(nbrLignes, nbrColonnes);
		TableauUtils.afficher(tab);
		
		System.out.print("Somme : " + TableauUtils.somme(tab));
		System.out.println();	
		System.out.print("Produit : " + TableauUtils.produit(tab));
		System.out.println();
		System.out.print("Moyenne : " + TableauUtils.moyenne(tab));
	
	}

}
