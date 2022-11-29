import java.util.*;

public class Exercice1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String genre = "";
		String valeur1 = "homme";
		String valeur2 = "femme";
		
		
		 do {
            System.out.println("Entrez un genre : ");
            genre = sc.nextLine();
            System.out.println("valeur de genre : " + genre);
        } while( !(genre.equals(valeur1) || genre.equals(valeur2)));  
		
       sc.close();
	   
    }
}
	