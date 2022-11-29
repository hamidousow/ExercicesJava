import java.util.*;

public class Exercice4_5 {

	public static void main(String[] args){
	
     	Scanner sc = new Scanner(System.in);
		String sex;
		
		do {
			System.out.println("entrez H pour homme ou F pour femme: ");
			sex = sc.nextLine();
	    } while(!sex.equalsIgnoreCase("H") && !sex.equalsIgnoreCase("F"));

		System.out.println("entez votre age: ");
		int age = sc.nextInt();
		
		if((sex.equalsIgnoreCase("H") && age >=20) || (sex.equalsIgnoreCase("F") && age >= 18 && age < 35)) {	
      		System.out.println("vous etes imposable");
		} else {
			System.out.println("vous etes non-imposable");
		}
    }
}