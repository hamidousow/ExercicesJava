import java.util.*;

public class Exercice11PlusPlus{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le nombre de valeur");
        int n = sc.nextInt();
        
        int tab[] = TableauUtils.generationTableauAleatoire(n);	
        TableauUtils.afficherTableau(tab);
		
        System.out.println("Saisissez la valeur a inserer a la fin: ");
        int element = sc.nextInt();
        System.out.println("Saisissez index  : ");
        int index = sc.nextInt();
		tab = TableauUtils.add(tab,element,index);
		
	    TableauUtils.afficherTableau(tab);
	   
    }
	
	
	

}