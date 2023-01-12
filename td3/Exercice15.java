<<<<<<< HEAD
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
=======
import java.util.Scanner;

public class Exercice15 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir la taille du tableau A : ");
		int tailleTableauA = Integer.parseInt(sc.nextLine());
		int [] tabA = TableauUtils.generationAleatoire(tailleTableauA);
		
		System.out.print("Saisir la taille du tableau B : ");
		int tailleTableauB = Integer.parseInt(sc.nextLine());		
		int [] tabB = TableauUtils.generationAleatoire(tailleTableauB);
		
		
		TableauUtils.afficher(tabA);
		TableauUtils.afficher(tabB);
		
		int[] tabFusion = TableauUtils.fusion(tabA, tabB);
		
		TableauUtils.afficher(tabFusion);	
>>>>>>> 4d9e668b6e6cd1cc2fc97bf621dbabf830def0bc
	}
}