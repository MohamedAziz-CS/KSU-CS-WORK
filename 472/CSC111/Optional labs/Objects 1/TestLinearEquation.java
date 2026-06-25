import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		LinearEquation equation = new LinearEquation();

		System.out.print("Enter a, b, c, d, e, f: ");
		equation.a = in.nextDouble();
		equation.b = in.nextDouble();
		equation.c = in.nextDouble();
		equation.d = in.nextDouble();
		equation.e = in.nextDouble();
		equation.f = in.nextDouble();

		if (equation.isSolvable()) {

			System.out.println("x is " + equation.sloveX() + " and y is " + equation.sloveY());

		} else {

			System.out.println("The system has no solution");

			System.exit(0);

		}
		in.close();

	}
}

class LinearEquation {

	public double a;
	public double b;
	public double c;
	public double d;
	public double e;
	public double f;

	public boolean isSolvable() {
		if (a * d - b * c == 0)
			return false;
		else
			return true;

	}

	public double sloveX() {

		double x = (e * d - b * f) / (a * d - b * c);
		return x;

	}

	public double sloveY() {

		double y = (a * f - e * c) / (a * d - b * c);
		return y;

	}

}
