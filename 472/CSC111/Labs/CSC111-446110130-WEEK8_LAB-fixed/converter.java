// code was written by Mohamed Aziz Khelifi ( 446110130 )

import java.util.Scanner;

public class converter {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	double riyal=0;
	String currency;
	
	
	boolean work=false;
	
	 while  (!work) {
		 
		    System.out.print("Enter the amount in Riyals: ");
			riyal = in.nextDouble();
		    System.out.print("Enter the choice to convert USD or GBP: ");
		    currency=in.next().toLowerCase();
		    
		    double riyalToUSD=riyal*0.27;
			int USD = (int)riyalToUSD;
			double riyalToGBP=riyal*0.2;
			int GBP = (int)riyalToGBP;
			
		    switch (currency) {
		    
		    	case "usd":
		    		System.out.printf("The amount in Dollars = %.2f USD, %d USD"  ,riyalToUSD , USD);
		    		break;
		    	
		    	case "gbp":
		    		System.out.printf("The amount in Pounds = %.2f GBP, %d GBP"  ,riyalToGBP , GBP);
		    		break;
		    	
		    	default:	
		    		System.out.print("Incorrect currency. USD or GBP only");
		    		break;
		    }
		    
		    System.out.print("\nDo you want to continue: ");
		    String go =in.next();
		    
		    switch(go) {
		    
		    	case "Yes":
		    	case "yes":
		    	case "Y":
		    	case "y":
		    		break;
		    		
		    	default:	
		    		work=true;
		    		break;
	
		    }
		    	
		    
		    }
		
	 in.close();
	 
	}
		

	}
