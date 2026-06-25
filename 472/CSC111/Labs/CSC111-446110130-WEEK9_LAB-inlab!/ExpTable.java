import java.util.Scanner;

public class ExpTable {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int num;
		
		System.out.print("Enter value of n: ");
		num = in.nextInt();
		System.out.println("The Exponent Tables of first "+ num +" numbers are");
		
		for (int i = 1;i<=num;i++) {
			
			for (int j=1; j<=5; j++) {
			
			 int a = (int)  Math.pow(j,i);
			 System.out.printf(String.format("%d^%d=%4d ",i,j,a));
			 System.out.print(" ");
			}
			System.out.println(" ");
		}
in.close();
	}

}
