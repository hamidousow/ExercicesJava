import java.util.Scanner;

public class Exercice8{
    
    public static void main(String args[]){
        
        
        int jour=0;
        int mois=0;
        int annee=0;
        boolean jourParMois31=false;
        boolean jourParMois30=false;
        boolean jourParMois29=false;
        boolean jourParMois28=false;
        int bissextile=0;

        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Entrez l'année");
        annee=sc.nextInt();
        
        System.out.println("Entrez le mois");
        mois=sc.nextInt();
                
        System.out.println("Entrez le jour");
        jour=sc.nextInt();
        
        if (mois>12){
            System.out.println("date pas valide");
        }
         
        if ( ((annee % 4 ==0) && (annee % 100) >0) || (annee%400==0) ){
            bissextile=1;
        }
        
        
        
        if ((mois==1 || mois==3 || mois==5 || mois==7 || mois==8 ||mois==10 || mois==12) && jour<=31){
            jourParMois31=true;
        }else if(mois==4 || mois==6 || mois==9 || mois==11 && jour<=30){
            jourParMois30=true;
        }else if((mois==2 && bissextile==1 && jour <=29)){
            jourParMois29=true;
        }else if(mois==2 && jour<=28){
            jourParMois28=true;
        }
        
        
        
        if ((jourParMois31==true) || (jourParMois30==true) || (jourParMois29==true) || (jourParMois28==true)){
            System.out.println("date valide");
        }else{
            System.out.println("date pas valide");
        }   
   }