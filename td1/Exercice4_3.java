import java.util.*;

public class Exercice4_3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int heure;
		int minute;
		int seconds;
		String heureString,minuteString,secondsString;
		String reponseUtilisateur ;
		while(true){
			
			System.out.print("Heure : ? ");
			heureString = sc.nextLine();
			heure = Integer.parseInt(heureString);
			System.out.print("Minutes : ? ");
			minuteString = sc.nextLine();
			minute = Integer.parseInt(minuteString);
			System.out.print("Seconds : ? ");
			secondsString = sc.nextLine();
			seconds = Integer.parseInt(secondsString);
			
			if ((++seconds) == 60) {
				seconds = 0;
				minute++;
			}
			
			if (minute == 60) {
				minute = 0;
				heure++;
				heure %= 24;
			}

			System.out.println("L'heure sera " + heure + ":" + minute + ":" + seconds);
			
			System.out.print("Voulez vous continuer ? ");
			reponseUtilisateur = sc.nextLine();
			
			if(reponseUtilisateur.trim().toLowerCase().equals("non")){
				break;
			}
		}
		System.out.print("Au revoir");
	}