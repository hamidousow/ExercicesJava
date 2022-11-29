import java.util.Scanner;

public class Exercice45{
    
    public static void main(String[] args) {
        
        float facture = 0;
        
        Scanner maSaisie = new Scanner(System.in);
        
        System.out.println("Veuillez le nombre de photocopies");
        int photocopies = maSaisie.nextInt();
        
        if(photocopies <= 10){
            facture = (float)( photocopies * 0.10);
        }
        
        if(photocopies > 10){
            facture = (float)(10 * 0.10 + (photocopies - 10) * 0.09);
        }
        
        if(photocopies > 10 && photocopies <= 30){
            facture = (float)(10 * 0.10 + (photocopies - 10) * 0.09);
        }
        
        if(photocopies > 30){
            facture = (float)(10 * 0.10 + 20 * 0.09 + (photocopies - 30) * 0.08);
        }
        
        System.out.println("Votre facture sera de" + facture);
    }
    
}