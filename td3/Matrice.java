import java.util.Iterator;

public class Matrice {

	
	public static void main(String[] args) {

		int [][] matrice = new int [6][]; 
		
		System.out.println(matrice.length);
		
		for (int i = 0; i < matrice.length; i++) {
			System.out.println("matrice["+i+"] = "+ matrice[i]);
		}
		
		for (int i = 0; i < matrice.length; i++) {
			matrice[i] = new int[i];
		}
		
		for (int i = 0; i < matrice.length; i++) {
			System.out.println("matrice["+i+"] = "+ matrice[i]);
		}
	    int cpt=0;
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = cpt++;
				System.out.print(matrice[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//2eme facon
		matrice = new int [6][5]; 
		System.out.println(matrice.length);
		
		for (int i = 0; i < matrice.length; i++) {
			System.out.println("matrice["+i+"] = "+ matrice[i]);
		}
		
		
	    cpt=0;
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = cpt++;
				System.out.print(matrice[i][j]+"\t");
			}
			System.out.println();
		}
		
		//test 
		
		int matrice3 [][] = new int[8][];
		System.out.println(matrice3.length);
		
		for(int i = 0; i < matrice3.length ; i++) {
			System.out.println("matrice3 "+ i + " : " + " = " + matrice3[i]);
		}
		
		for(int i = 0; i< matrice3.length; i++) {
			
		}
	}


}

