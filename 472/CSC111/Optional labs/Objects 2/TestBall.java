import java.util.Scanner;

public class TestBall {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Ball b1 = new Ball(2, 2);
		b1.move(3, -2);
		b1.move(2, -7);
		Ball b2 = new Ball();
		b2.move(7, -7);
		b2.move(2, 4);
		System.out.println("b1:");
		System.out.println(b1.toString());
		System.out.println("Distance Traveled X: " + b1.getDistTraveledX());
		System.out.println("Distance Traveled Y: " + b1.getDistTraveledY());
		System.out.println(" ");

		System.out.println("b2:");
		System.out.println(b2.toString());
		System.out.println("Distance Traveled X: " + b2.getDistTraveledX());
		System.out.println("Distance Traveled Y: " + b2.getDistTraveledY());
		System.out.println(" ");

		System.out.println("Total All Balls X: " + Ball.totDistXAllBalls);
		System.out.println("Total All Balls Y: " + Ball.totDistYAllBalls);

		in.close();

	}

}
