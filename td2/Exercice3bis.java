import java.util.*;

class Exercice3bis {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir un nombre");
        int nombre = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < 10; i++) {
            System.out.println(nombre + (i+1) + "\n");
        }
    }
}