import java.util.*;

public class Exercice2 {
	
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nombre = 0;
        
        System.out.println("Saisir un nombre : ");
        nombre = sc.nextInt();
        
        while(nombre < 10 || nombre > 20){
            
            if(nombre > 20){
                System.out.println(" Plus petit, recommencez ");
                nombre = sc.nextInt();
            } else if(nombre < 10){
                System.out.println(" Plus grand, recommencez ");
                nombre = sc.nextInt();
            }
        }
        
        System.out.println("Bon nombre");
    }
}