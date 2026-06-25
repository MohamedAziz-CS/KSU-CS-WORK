package week5;

import java.util.Scanner;

public class week5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double x;
		
		System.out.print("Enter X value: ");
		x=in.nextDouble();
		
		double formula = (++x * --x - --x )/((++x - --x)*(2*x/x));
		
		System.out.println("The result is "+formula);
	in.close();
	}

}
