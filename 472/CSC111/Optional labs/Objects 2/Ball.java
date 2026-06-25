
public class Ball {

	public double x;
	public double y;
	public double distTraveledX;
	public double distTraveledY;
	public static double totDistXAllBalls;
	public static double totDistYAllBalls;
	public static double lastX;
	public static double lastY;

	public Ball() {
		x = 0.0;
		y = 0.0;
	}

	public Ball(double newX, double newY) {

		this.x = newX;
		this.y = newY;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void move(double xDisp, double yDisp) {

		if (x + xDisp != lastX || y + yDisp != lastY) {

			distTraveledX += Math.abs(x - (x + xDisp));
			totDistXAllBalls += Math.abs(x - (x + xDisp));
			distTraveledY += Math.abs(y - (y + yDisp));
			totDistYAllBalls += Math.abs(y - (y + yDisp));

			x += xDisp;
			y += yDisp;

			lastX = x;
			lastY = y;

		} else {
			System.out.println("The ball in position (" + x + ", " + y + ") cannot move to position (" + lastX + ", "
					+ lastY + ")");

		}

	}

	public double getDistTraveledX() {
		return distTraveledX;
	}

	public double getDistTraveledY() {
		return distTraveledY;
	}

	public static double getTotDistXAllBalls() {
		return totDistXAllBalls;
	}

	public static double getTotDistYAllBalls() {
		return totDistYAllBalls;
	}

	public String toString() {
		String x = "";
		x = "Ball @ (" + this.x + "," + y + ")";
		return x;

	}

}
