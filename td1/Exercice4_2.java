import java.util.*;

public class Exercice4_2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Heure : ? ");
		String heureString = sc.nextLine();
		int heure = Integer.parseInt(heureString);
		System.out.print("Minutes : ? ");
		String minuteString = sc.nextLine();
		int minute = Integer.parseInt(minuteString);

		if ((++minute) == 60) {
			minute = 0;
			heure++;
			heure %= 24;
			/*
			 * heure = heure + 1; heure = heure % 24;
			 */

		}

		System.out.println("L'heure sera " + heure + ":" + minute);

	}
