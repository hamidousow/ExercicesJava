import java.util.*;
public class Exercice4_4 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//int,boolean,char,String,double,float,long

		System.out.println("Saisissez le nombre de copies:");				
		int nombreCopie = sc.nextInt();

		double prix = 0;
				
		if(nombreCopie <= 10){
		
		prix = (nombreCopie * 0.1);
		
		}else if(nombreCopie <= 30){
		
			prix = ((nombreCopie - 10) * 0.09 + 1);
			
	    }else{
			prix = ((nombreCopie - 30) * 0.08 + 2.8);
	    }	
	   	
        System.out.println("Le prix est de :" +prix+ " euros.");
  						
	}
}