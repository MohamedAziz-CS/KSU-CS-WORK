import java.util.Scanner;

public class UnspecifiedNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integers ending with 0: ");
		int sum = 0;
		int x = 0;
		int countPositive = 0, countNegative = 0;
		do {
			x = in.nextInt();
			if (x > 0) {
				countPositive++;
			} else if (x < 0) {
				countNegative++;
			} else {
				x = 0;
			}
			sum += x;
		} while (x != 0);
		if (countPositive != 0 || countNegative != 0) {
			System.out.println("The number of positives is " + countPositive);
			System.out.println("The number of negatives is " + countNegative);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + (sum / (double) (countPositive + countNegative)));
		} else {
			System.out.println("no numbers are entered except 0");
		}
		in.close();
	}

}
