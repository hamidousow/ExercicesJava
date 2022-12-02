import java.util.*;

public class Exercice9{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le nombre de valeur");
        int n = sc.nextInt();
        
        int tab[] = new int [n];
        int i = 0;
        
        System.out.println("Saisissez les valeurs: ");

        for (i=0;i<n;i++){           
                              
            tab[i] = sc.nextInt();  
            System.out.println("encore "+ (n-i-1) + " valeur(s)" );                 
                              
        }	

        System.out.println("Saisissez la valeur a inserer a la fin: ");
        int valeurFin = sc.nextInt();
        int tmp[] = new int [(n+1)];

        for ( i=0;i<n;i++){           

            tmp[i] = tab[i];        
            
        }
        tmp[n] = valeurFin;
        System.out.println(Arrays.toString(tmp));
    }

}