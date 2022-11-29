import java.util.*;

public class ExempleRandom {

	public static void main(String args[]) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Donnez un nombre svp : ? ");
		// int nombre = sc.nextInt();

		/*
		 * if (nombre == 1) System.out.println("Un"); else if (nombre == 2)
		 * System.out.println("Deux"); else if (nombre == 3)
		 * System.out.println("Trois"); else System.out.println("Autre");
		 */
//		switch (nombre) {
//		case 1:
//			System.out.println("Un");
//			break;
//		case 2:
//			System.out.println("Deux");
//			break;
//		case 3:
//			System.out.println("Trois");
//			break;
//		default:
//			System.out.println("Autre");
//		}
		int taille;
		Random ran = new Random();
		String string;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				taille = ran.nextInt(7+1-2)+2;
				
				string = nextString(taille);
				System.out.printf("|%-10s|",string);
			}
			System.out.println(System.lineSeparator());
		}
		
		
	}

	public static String nextString(int length, boolean withNumber) {
		String token = "";

		for (int i = 0; i < length; i++) {
			token += nextChar(withNumber);
		}

		return token;
	}

	public static String nextString(int length) {
		return nextString(length, false);
	}

	public static char nextChar(boolean withNumber) {
		Random ran = new Random();
		int d;

		boolean condition;

		int max = 'z';
		int min = 'A';

		do {
			if (withNumber) {
				max = 'z';
				min = '0';
			}

			d = ran.nextInt(max + 1 - min) + min;
			// condition:(si true)X:(sinon)Y;
			condition = !withNumber ? ((d >= 48 && d <= 57) || (d >= 91 && d <= 96) ) : ((d >= 58 && d <= 64) || (d >= 91 && d <= 96));
		} while (condition);
		return (char) d;
	}

	public static char nextChar() {
		return nextChar(false);
	}
}
