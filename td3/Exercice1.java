import java.util.*;

	public class Exercice1 {
		public static void main ( String [] args) {
			
			Scanner sc = new Scanner(System.in) ;
			
			int[] elements = saisirTableau(5,sc);
			
			int somme = 0 ;
			for (int i=0 ; i<elements.length; i++){
				
				somme = somme + elements[i];
			}
			
			for (int i=0 ; i<elements.length; i++){
				System.out.print(elements[i]+ "\t");
				
			}
			System.out.print("\n");
			System.out.println("la somme = " + somme );
			
		}
		
		
		public static  int[] saisirTableau(int nombreElement,Scanner sc){
			int[] elements = new int[nombreElement];
			for (int i=0 ; i<elements.length; i++){
				System.out.print(" veuillez entrer l'element["+i+"] = ");
				elements[i]= Integer.parseInt(sc.nextLine());
			}
			return elements;
		}
	}

