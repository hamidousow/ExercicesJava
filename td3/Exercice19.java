import java.util.*;

public class Exercice19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random ran = new Random();
		
		System.out.print(" Merci de donner le nombre de lignes :  ");
		int nombreLignes = sc.nextInt();
	
		
		
		int [][] trianglePascal = new int [nombreLignes][];
		for(int i=0;i<trianglePascal.length;i++){
			trianglePascal[i] = new int [nombreLignes];	
		}	
		
		
		trianglePascal[0][0] = 1;
		
		for (int i = 0 ;i<trianglePascal.length;i++){
			trianglePascal[i][0] = 1;
			trianglePascal[i][i] = 1;
			for (int j = 1 ;j<i;j++){
				trianglePascal[i][j] = trianglePascal[i-1][j-1] + trianglePascal[i-1][j];	
			}
		}
		
		
		for (int i = 0 ;i<trianglePascal.length;i++){
			for (int j = 0 ;j<=i;j++){
				System.out.print(trianglePascal[i][j]+"\t");	
			}
			System.out.println();
		}
		

	}
}
