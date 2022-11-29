import java.util.*;

public class Exercice18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random ran = new Random();
		
		System.out.print(" Merci de donner le nombre de lignes de la 1ere matrice :  ");
		int nombreLignesMatrice1 = sc.nextInt();
		System.out.print(" Merci de donner le nombre de colonnes de la 1ere matrice :  ");
		int nombreColonnesMatrice1 = sc.nextInt();
		int nombreLignesMatrice2 = nombreColonnesMatrice1;
		System.out.print(" Merci de donner le nombre de colonne de la 2ere matrice :  ");
		int nombreColonnesMatrice2 = sc.nextInt();
	
		int [][] matrice1 = new int [nombreLignesMatrice1][];
		int [][] matrice2 = new int [nombreLignesMatrice2][];
		int [][] matrice3 = new int [nombreLignesMatrice1][];
		
		for(int i=0;i<matrice1.length;i++){
			matrice1[i] = new int [nombreColonnesMatrice1];	
		}
		
		for(int i=0;i<matrice2.length;i++){
			matrice2[i] = new int [nombreColonnesMatrice2];	
		}
		
		for(int i=0;i<matrice3.length;i++){
			matrice3[i] = new int [nombreColonnesMatrice2];	
		}
		
		for (int i = 0 ;i<matrice1.length;i++){
			for (int j = 0 ;j<matrice1[i].length;j++){
				matrice1[i][j] = ran.nextInt(10);	
			}
		}
		
		
		for (int i = 0 ;i<matrice2.length;i++){
			for (int j = 0 ;j<matrice2[i].length;j++){
				matrice2[i][j] = ran.nextInt(10);	
			}
		}
		System.out.println("Matrice1 : ");
		for (int i = 0 ;i<matrice1.length;i++){
			for (int j = 0 ;j<matrice1[i].length;j++){
				System.out.print(matrice1[i][j]+"\t"); 	
		
			}
			System.out.println();
		}
		System.out.println("Matrice2 : ");
		for (int i = 0 ;i<matrice2.length;i++){
			for (int j = 0 ;j<matrice2[i].length;j++){
				System.out.print(matrice2[i][j]+"\t"); 
				
			}
			System.out.println();
		}
	

		for (int i = 0 ;i<matrice3.length;i++){
			for (int j = 0 ;j<matrice3[i].length;j++){
				for (int k = 0 ;k<matrice2.length;k++){
					matrice3[i][j] =matrice3[i][j]+ matrice1[i][k]*matrice2[k][j];  
				}	
			}
		}
		
		System.out.println("Matrice3 : ");
		for (int i = 0 ;i<matrice3.length;i++){
			for (int j = 0 ;j<matrice3[i].length;j++){
				System.out.print(matrice3[i][j]+"\t"); 
				
			}
			System.out.println();
		}
	
	}
}
