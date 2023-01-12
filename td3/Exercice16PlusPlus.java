import java.util.*;

public class Exercice16PlusPlus{

	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Veillez saisir le n: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.print("Veillez saisir le m: ");
		int m = Integer.parseInt(sc.nextLine());
		int tab[][] = TableauUtils.generationAleatoire(n,m);
		TableauUtils.afficher(tab);
		
		System.out.println("La somme = "+TableauUtils.somme(tab));
		System.out.println("La produit = "+TableauUtils.produit(tab));
		System.out.println("La moyenne = "+TableauUtils.moyenne(tab));
	
	}

}
