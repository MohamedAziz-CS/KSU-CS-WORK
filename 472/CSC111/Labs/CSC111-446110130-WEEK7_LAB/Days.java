// Mohamed Aziz Khelifi ( 446110130 )

import java.util.Scanner;

public class Days {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
        System.out.print("Enter a day's name: ");
        String day = in.next().toLowerCase();
        
        switch (day){
            
        case "sunday":
        
            		System.out.print("5 days until the next weekend.");
                    break;
                    
       case "monday":
        
            		System.out.print("4 days until the next weekend.");
            		break;
            		
       case "tuesday":
        
            		System.out.print("3 days until the next weekend."); 
            		break;
            		
       case "wednesday":
        
            		System.out.print("2 days until the next weekend."); 
                    break;
                          
       case "thursday":
        
            		System.out.print("1 day until the next weekend."); 
            		break;
            		
       case "friday":
       case "saturday":
                    
                    System.out.print("Weekend!");
                    break;               
                    
       default:
      
                    System.out.print("Incorrect day.");
                    break;
      }  
        
   in.close();    		    		   		   		    		   		   		
			
	}
}