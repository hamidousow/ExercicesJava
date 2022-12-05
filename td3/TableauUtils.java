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
	
	public static double moyenneTableau(int[] tab){
     	return (double)sommeTableau(tab)/tab.length;
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
	public static int[] add(int[] tab,int element){
		tab = TableauUtils.redim(tab,tab.length+1);
	    tab[tab.length-1]=element;
	    return tab;		
	}
	
	public static int[] supprimer(int[] tableau,int index){
		
		/*int a = condi?valOk:;
		
		int a;
		if(condi){
			a=  valOk;
		}else {
			if(condi2){
				a=  valOk2;
		    }else {
				a = valElse
			 }
		}*/
		
		int tmp[] = null;
		
		if(tableau!=null && tableau.length>0)
			tmp = new int[tableau.length-1];	
	
		if(tableau == null )
			throw new IllegalArgumentException("Tableau en entrée est null");	
		if(tableau.length==0)
			throw new IllegalArgumentException("Tableau est vide");	
		if(index<0 || index>tmp.length)
			throw new IllegalArgumentException("L'index est incorrect");
		
		for (int i=0; i<tmp.length;i++){
			if(i<index){
				tmp[i]=tableau[i];
			}else{
				tmp[i]=tableau[i+1];
			}	
		}

		return tmp;		
	}
	
	public static int[] trier(int[] tableau,boolean asc){
		
		if(tableau == null )
			return null;	
		boolean condition ;
	    int tmp;
		for(int i=0;i<tableau.length-1;i++){
			for(int j=i+1;j<tableau.length;j++){
				condition = asc?(tableau[i] > tableau[j]):(tableau[i] < tableau[j]);
				if(condition){
				tmp = tableau[j];
				tableau[j]= tableau[i];
				tableau[i] = tmp;
				}
			}
		}
		return tableau;		
	}
	
}	