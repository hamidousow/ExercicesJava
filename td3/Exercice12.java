import java.util.*;

public class Exercice12 {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);		
		
		int tab [] = TableauUtils.generationTableauAleatoire(Integer.parseInt(sc.nextLine()), sc);			
		TableauUtils.afficherTableau(tab);
		//TableauUtils.deleteELement(tab, sc);
			
	}
}