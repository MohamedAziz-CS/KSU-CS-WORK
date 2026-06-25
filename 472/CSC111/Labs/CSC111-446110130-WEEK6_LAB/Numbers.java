// Program coded by Mohamed Aziz Khelifi (446110130)

import java.util.Scanner;

public class Numbers {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter a number between 0-10 or 90-100: ");
		int x = in.nextInt();
		
		if ((x >= 0 && x<=10) || (x>=90 && x<=100)){
		    System.out.print(x + " is a correct input");
		} else {
		    System.out.print(x + " is an invalid input");
		}
		
	in.close();
	
	}
}