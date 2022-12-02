import java.util.*;
public class TableauUtils{

	public static int sommeTableau(int[] tab){
     	int somme = 0;
		for(int i = 0; i < tab.length; i++) {			
			somme = tab[i] + somme;
		}
		return somme;
	}
	public static int produitTableau(int[] tab){
     	int produit = 1;
		for(int i = 0; i < tab.length; i++) {		
			produit = tab[i] * produit;
		}
		return produit;
	}
	
	public static int moyenneTableau(int[] tab){
     	return sommeTableau(tab)/tab.length;
	}
	
	public static  int[] saisirTableau(int nombreElement,Scanner sc){
		
		int[] elements = new int[nombreElement];
		
		for (int i=0 ; i<elements.length; i++){
			System.out.print(" veuillez entrer l'element["+i+"] = ");
			elements[i]= Integer.parseInt(sc.nextLine());
		}
		
		return elements;
	}
    public static  int[] generationTableauAleatoire(int nombreElement){
		return generationTableauAleatoire(nombreElement,0,200);
	}
	
	public static  int[] generationTableauAleatoire(int nombreElement,int min,int max){
		Random ran=new Random();
		int[] elements = new int[nombreElement];
		for (int i=0 ; i<elements.length; i++){
		
			elements[i]= ran.nextInt(max+1-min)+min;
		}
		return elements;
	}
	
	public static void afficherTableau(int[] elements){		
		for (int i=0 ; i<elements.length; i++){		
			System.out.print(elements[i]+"\t");				
		}
		System.out.println();
	}
	
	public static int[] chercherToutesOccurences(int elementsAChercher,int[] elements){
		int nbrIndex = calculerNombreOccurences(elementsAChercher,elements);
		
        int[] index = new int[nbrIndex]; 
		 	
        int cptIndexOk = 0;
		for(int i=0;i<elements.length;i++){	
		
			if(elements[i]==elementsAChercher){
			    index[cptIndexOk++] = i;     				
			}				
		}
		return index;
		
	}
	public static int chercherPremiereOccurence(int elementRechercher,int[] elements){
		
		for(int i = 0; i < elements.length; i++){
			if(elements[i] == elementRechercher){
				return i;
			}
		}
		return -1;
	}
    public static int chercherDerniereOccurence(int elementRechercher,int[] elements){
		
		for(int i =elements.length-1 ; i >= 0; i--){
			if(elements[i] == elementRechercher){
				return i;
			}
		}
		return -1;
	}
    public static int calculerNombreOccurences(int elementsAChercher,int[] elements){
		int nbrIndex = 0;
		for(int i=0;i<elements.length;i++){				
			if(elements[i]==elementsAChercher){
				nbrIndex++;
			}				
		}
        return nbrIndex;
		
	}	
	
}	