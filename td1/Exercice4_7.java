
import java.util.*;

	public class Exercice4_7{
		public static void main ( String args[]){
		  
		Scanner sc = new Scanner(System.in);
		  
		int age ;
		int experience;
		int tarif;
		int nombreAccidant;
		int fidelite;
          
            
		   
		System.out.println(" saisir votre age ");
		    age = sc.nextInt();
			
		System.out.println(" saisir experience");
		    experience = sc.nextInt();
			
		System.out.println(" saisir nombre d'accidant");	
            nombreAccidant = sc.nextInt();
			
		System.out.println(" saisir année de fidelité");	
			 fidelite = sc.nextInt(); 
				 
		if (( age < 25) && (experience<2)){
		
				tarif = 1;	
							
			} else { 
				tarif = 0;				 
			}
		if ((( age < 25) && (experience>2))||(( age > 25)&&(experience<2))){
				 if(nombreAccidant == 0){
					 tarif = 2;
					 
				 }else if( nombreAccidant == 1){
					 tarif = 1;
											

				 }else {
					 tarif = 0;
				 } 
			}
				if (( age>25)&&(experience>2)){
				
					if(nombreAccidant ==0){
						tarif=3;          
					} else if (nombreAccidant ==1){
						tarif = 2;         
					} else if ( nombreAccidant ==2){
						tarif =1;        
					} else{
						tarif = 0;	      
					}	
			}
			if((fidelite>5) && (tarif>0)){
				 tarif++;
				 System.out.println(tarif);
			}
			if(tarif>4) {
				System.out.println(" Tarif Bleu ");
			}else if( tarif>3){
				System.out.println(" Tarif Vert");
			}else if ( tarif>2) {
				System.out.println(" Tarif Orange");
			}else if (tarif>1){
				System.out.println(" Tarif Rouge");
			}else {
				System.out.println(" Refusé");
			}
   
	  }
	  
  }

















