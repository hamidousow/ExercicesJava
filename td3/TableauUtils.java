import java.util.Random;
import java.util.Scanner;
public class TableauUtils{

	public static int somme(int[] tab){
     	int somme = 0;
		for(int i = 0; i < tab.length; i++) {			
			somme = tab[i] + somme;
		}
		return somme;
	}
	
	public static int[][] pascal(int limite){
		
		if(limite<3){
			throw new IllegalArgumentException("Impossible : taille >3 ");
		}
		
     	int[][] pascalTab = new int[limite][];
		
		for(int i =0; i<pascalTab.length;i++){
			pascalTab[i]= new int[i+1];
			pascalTab[i][0]=1;
			pascalTab[i][i]=1;
		}
		
		for(int i =1; i<pascalTab.length;i++){
			for(int j =1; j<pascalTab[i].length-1;j++){
				pascalTab[i][j]=pascalTab[i-1][j]+pascalTab[i-1][j-1];
			}
		}
		return pascalTab;
 	}
	
	public static int[][] produit(int[][] a,int[][] b){
		
		if(a[0].length != b.length){
			throw new IllegalArgumentException("Impossible : nombre de colonnes de a!= nombre de lignes de b");
		}
		
     	int[][] produitMatrices = new int[a.length][b[0].length];
		
		for(int i =0; i<produitMatrices.length;i++){
			for(int j =0; j<produitMatrices[i].length;j++){
				produitMatrices[i][j] =0;
				for(int k=0;k<b.length;k++){
					produitMatrices[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}
		return produitMatrices;
 	}
	
	public static int sommeDiagonale(int[][] tab){
     	int somme = 0;
		for(int i = 0; i < tab.length; i++) {			
			somme += tab[i][i];
		}
		return somme;
	}
	
	public static int somme(int[][] tab){
     	int somme = 0;
		for(int i = 0; i < tab.length; i++) {			
			somme = somme(tab[i]) + somme;
		}
		return somme;
	}
	
	public static int produit(int[] tab){
     	int produit = 1;
		for(int i = 0; i < tab.length; i++) {		
			produit = tab[i] * produit;
		}
		return produit;
	}
	
	public static int produit(int[][] tab){
     	int produit = 1;
		for(int i = 0; i < tab.length; i++) {		
			produit = produit(tab[i]) * produit;
		}
		return produit;
	}
	
	public static double moyenne(int[][] tab){
		int taille = 0;
		for(int i = 0; i < tab.length; i++) {		
			taille += tab[i].length;
		}
     	return (double)somme(tab)/taille;
	}
	
	public static double moyenne(int[] tab){
     	return (double)somme(tab)/tab.length;
	}
	
	public static  int[][] saisir(int n,int m,Scanner sc){
		
		int[][] elements = new int[n][m];
		
		for (int i=0 ; i<elements.length; i++){
			for(int j=0;j<elements[i].length;j++){
				System.out.print(" veuillez entrer l'element["+i+"]["+j+"]  = ");
			    elements[i][j]= Integer.parseInt(sc.nextLine());
			}
		}
		
		return elements;
	}
	
	public static  int[] saisir(int nombreElement,Scanner sc){
		
		int[] elements = new int[nombreElement];
		
		for (int i=0 ; i<elements.length; i++){
			System.out.print(" veuillez entrer l'element["+i+"] = ");
			elements[i]= Integer.parseInt(sc.nextLine());
		}
		
		return elements;
	}
	
	public static  int[][] generationAleatoire(int n,int m){
		return generationAleatoire(n,m,10,200);
	}
	
	public static  int[][] generationAleatoire(int n,int m,int min,int max){
		Random ran=new Random();
		int[][] elements = new int[n][];
		/*for (int i=0 ; i<elements.length; i++){
			for (int j=0 ; j<elements[i].length; j++){
				elements[i][j]= ran.nextInt(max+1-min)+min;
			}	
		}*/
		for (int i=0 ; i<elements.length; i++){
			elements[i] = 	generationAleatoire(m,min,max);
		}
		
		return elements;
	}
	
    public static  int[] generationAleatoire(int nombreElement){
		return generationAleatoire(nombreElement,0,200);
	}
	
	public static  int[] generationAleatoire(int nombreElement,int min,int max){
		Random ran=new Random();
		int[] elements = new int[nombreElement];
		for (int i=0 ; i<elements.length; i++){
		
			elements[i]= ran.nextInt(max+1-min)+min;
		}
		return elements;
	}
	public static void afficher(int[][] elements){		
		for (int i=0 ; i<elements.length; i++){		
			afficher(elements[i]);
		}
		
	}
	public static void afficher(int[] elements){		
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
	
	public static int[] fusion(int[] tab1, int[] tab2) {
		
		if(tab1 == null)
			tab1 = new int[0];
		
		if(tab2 == null)
			tab2 = new int[0];
		
		int[] tabFusion = new int[tab1.length+tab2.length];
		
		for(int i=0;i<tab1.length;i++){			
			tabFusion[i]=tab1[i];		
		}
		
		for(int i=0;i<tab2.length;i++){			
			tabFusion[i+tab1.length]=tab2[i];		
		}
		/*for(int i=tab1.length;i<tabFusion.length;i++){			
			tabFusion[i]=tab1[i-tab1.length];		
		}*/
		
		return tabFusion;
	}
}	