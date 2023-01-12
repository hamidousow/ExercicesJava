import java.util.*;

public class Exercice17PlusPlus{

	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Veillez saisir le n: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int tab[][] = TableauUtils.generationAleatoire(n,n);
		TableauUtils.afficher(tab);
		
		System.out.println("La somme diagonale = "+TableauUtils.sommeDiagonale(tab));

	
	}

}
