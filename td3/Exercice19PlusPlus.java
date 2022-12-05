import java.util.*;

public class Exercice19PlusPlus{

	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Veuillez saisir la limite: ");
		int limite = Integer.parseInt(sc.nextLine());
		
		int[][] pascalTab = TableauUtils.pascal(limite);
		System.out.println("Le triangle de pascal est : ");
		TableauUtils.afficher(pascalTab);
	
	}

}
