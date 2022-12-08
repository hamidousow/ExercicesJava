import java.util.*;
public class TableauUtils{
	
	/**
	calcule et retourne la somme des elements d'un tableau
	*/
	public static int sommeTableau(int[] tab){
     	int somme = 0;
		for(int i = 0; i < tab.length; i++) {			
			somme = tab[i] + somme;
		}
		return somme;
	}
	
	/**
	calcule et retourne la produit des elements d'un tableau
	*/
	public static int produitTableau(int[] tab){
     	int produit = 1;
		for(int i = 0; i < tab.length; i++) {		
			produit = tab[i] * produit;
		}
		return produit;
	}
	
	/**
	retourne la moyenne des elements d'un tableau
	*/	
	public static int moyenneTableau(int[] tab){
     	return sommeTableau(tab)/tab.length;
	}
	
	/**
	permet de saisir manuellement les donnees d'un tableau. Retourne un nouveau tableau
	*/
	public static  int[] saisirTableau(int nombreElement,Scanner sc){
		
		int[] elements = new int[nombreElement];
		
		for (int i=0 ; i<elements.length; i++){
			System.out.print(" veuillez entrer l'element["+i+"] = ");
			elements[i]= Integer.parseInt(sc.nextLine());
		}
		
		return elements;
	}
	
	/** renvoie un tableau rempli avec des entiers aléatoires. Bornes des entiers fixes de 0 à 200.*/
    public static  int[] generationTableauAleatoire(int nombreElement){
		return generationTableauAleatoire(nombreElement,0,200);
	}
	
	
	/** renvoie un tableau rempli avec des entiers aléatoires. Bornes des entiers aléatoire parametrables. */
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
	
	
	public static int[] redim(int[] tab,int nouvelleTaille){
		if(nouvelleTaille<0){
			nouvelleTaille=0; 
		}	

		int[] tmp = new int[nouvelleTaille];

		if(tab==null)
			return tmp;

		int tailleAParcourir = Math.min(tmp.length,tab.length);
		
		for(int i=0;i<tailleAParcourir;i++){
			tmp[i]=tab[i];
		}
		
		return tmp;
	}
	
	
	public static int[] add(int[] tab,int element){
		tab = TableauUtils.redim(tab,tab.length+1);
	    tab[tab.length-1]=element;
	    return tab;		
	}
	
	
	public static int[] replace(int[] tab,int element,int index){
	    tab[index]=element;
		return tab;		
	}
	
	
	public static int[] add(int[] tab,int element,int index){
		tab = TableauUtils.redim(tab,tab.length+1);
		for (int i=tab.length-2;i>=index;i--){    
            
			tab[i+1]=tab[i];
			
        }
	    tab[index]=element;
		return tab;		
	}
	
	public static void deleteElement(int [] tab, Scanner sc) {
		
		System.out.print("Saisir l'index de l'element a supprimer : ");		
		int elementToDelete = Integer.parseInt(sc.nextLine());
		
		int [] tmpTab = TableauUtils.redim(tab, tab.length-1);
		
		for(int i = 0; i < tab.length ; i++) {
			if( i < elementToDelete) {
				
				tmpTab[i] = tab[i];
				
			} else if (i > elementToDelete) {
				
				tmpTab[i-1] = tab[i];				
			}
		}
		
		tab = tmpTab;
		afficherTableau(tab);		
	}
	
	public static int [] filtreParOrdreCroissant(int [] tab) {
		
		int tmpVar = -1; 
		
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab.length-1; j++) {
				if(tab[i] < tab[j]) {
					tmpVar = tab[i];
					tab[i] = tab[j];
					tab[j] = tmpVar;
				}
			}			
		}
		
		return tab;
	}

	public static int [] filtreParOrdreDecroissant(int [] tab) {
		
		int tmpVar = -1; 
		
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab.length-1; j++) {
				if(tab[i] > tab[j]) {
					tmpVar = tab[i];
					tab[i] = tab[j];
					tab[j] = tmpVar;
				}
			}			
		}
		
		return tab;
	}
	
}	