public class Exercice4_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sexe = sc.nextLine();
		System.out.println("veuillez entrer votre sexe : ");			
		
		int age = sc.nextInt();
		System.out.println("veuillez entrer votre âge : ");	

		if(age > 20 && sexe.equals(homme)) || ((age >=18 && sexe = femme) || (age =< 35 && sexe = femme))  
			Ecrire “vous êtes imposable”
		else {
			System.out.println("veuillez entrer votre sexe : ");
		}
}