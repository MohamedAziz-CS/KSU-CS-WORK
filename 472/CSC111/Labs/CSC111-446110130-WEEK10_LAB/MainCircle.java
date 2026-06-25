// Coded by Mohamed Aziz Khelifi ( 446110130 ) 

package calculateCircle;

import java.util.Scanner;

public class MainCircle {

	public static void main(String[] args) {
		
		Circle s1 = new Circle();
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter the radius of the circle: ");
		
		s1.radius=in.nextDouble();
		
		s1.displayRadius();
		
		System.out.print("Area: "+ s1.calculateArea());
		
		in.close();
		
	}

}
