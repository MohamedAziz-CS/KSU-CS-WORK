import java.util.Scanner;

public class RentPrice {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
		double numofdays,price;
		final double TaxRate = 0.15;
		
		System.out.print("Enter the number of days: ");
		numofdays=in.nextDouble();
		
		System.out.print("Enter the rent per day: ");	
		price=in.nextDouble();
		
		double DiscountRate=0.01*numofdays;
		double PriceBeforeTax= (numofdays*price)*(1-DiscountRate);
		double RentPrice= PriceBeforeTax+(PriceBeforeTax*TaxRate);
		
		System.out.printf("Rent Price = %.3f SAR%n", RentPrice);
	in.close();
	
	
	//This program was coded by Mohamed Aziz Khelifi (446110130)
	}

}
