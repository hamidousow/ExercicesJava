import java.util.*;

public class Exercice18PlusPlus{

	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Veillez saisir le n de la matrice A: ");
		int nA = Integer.parseInt(sc.nextLine());
		System.out.print("Veillez saisir le m de la matrice A: ");
		int mA = Integer.parseInt(sc.nextLine());
		System.out.print("Veillez saisir le n de la matrice B: ");
		int nB = Integer.parseInt(sc.nextLine());
		System.out.print("Veillez saisir le m de la matrice B: ");
		int mB = Integer.parseInt(sc.nextLine());
		int a[][] = TableauUtils.generationAleatoire(nA,mA,1,5);
		int b[][] = TableauUtils.generationAleatoire(nB,mB,1,5);
		System.out.println("La matrice A: ");
		TableauUtils.afficher(a);
		System.out.println("La matrice B: ");
		TableauUtils.afficher(b);
		int[][] matrice = TableauUtils.produit(a,b);
		System.out.println("La matrice AxB: ");
		TableauUtils.afficher(matrice);
	
	}

}
