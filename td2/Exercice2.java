import java.util.*;

public class Exercice2 {
	
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nombre = 0;
        
        System.out.println("Saisir un nombre : ");
        nombre = Integer.parseInt(sc.nextLine());
        
        while(nombre < 10 || nombre > 20){
            
            if(nombre > 20){
                System.out.println(" Plus petit, recommencez ");
                nombre = Integer.parseInt(sc.nextLine());
            } else if(nombre < 10){
                System.out.println(" Plus grand, recommencez ");
                nombre = Integer.parseInt(sc.nextLine());
            }
        }
        
        System.out.println("Bon nombre");
    }
}