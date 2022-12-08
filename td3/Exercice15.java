import java.util.*;

public class Exercice15 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisier la taille du tableau 1 : ");
		int tailleTableau = Integer.parseInt(sc.nextLine());

		System.out.print("Saisier la taille du tableau 2 : ");
		int tailleTableau2 = Integer.parseInt(sc.nextLine());
		
		int tab [] = TableauUtils.generationTableauAleatoire(tailleTableau);
		int tab2 [] = TableauUtils.generationTableauAleatoire(tailleTableau2);

		TableauUtils.afficherTableau(tab);
		TableauUtils.afficherTableau(tab2);

        int [] newTab = new int [(tab.length + tab2.length)];

        for(int i = 0; i < tab.length; i++) {
            
        }
        TableauUtils.afficherTableau(newTab);
	}
}