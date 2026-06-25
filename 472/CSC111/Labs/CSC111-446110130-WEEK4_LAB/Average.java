import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	double n1,n2,n3;
	
	System.out.print("Enter 3 review scores: ");
	n1=in.nextDouble(); 
	n2=in.nextDouble(); 
	n3=in.nextDouble();
	
	double average = ((n1*2)+n2+n3)/4.0;
	int average1 = (int) average;
			
	System.out.println("Average = " + average + ", " + average1);
	
	in.close();
	
	//This program was coded by Mohamed Aziz Khelifi (446110130)
	}

}
