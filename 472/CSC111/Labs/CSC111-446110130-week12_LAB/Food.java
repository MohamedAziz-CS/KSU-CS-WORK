import java.util.Scanner;

public class Food {

	private String type;
	private double totalCal;
	private double fatCal;
	public static int foodCount=0;

	public Food() {
		this.type = "";
		this.totalCal = 0;
		this.fatCal = 0;
		foodCount++;

	}

	public Food(String type, double totalCal, double fatCal) {
		this.type = type;
		this.totalCal = totalCal;
		this.fatCal = fatCal;
		foodCount++;
	}

	public void readData() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of food: ");
		this.type = in.nextLine();
		System.out.println("Enter the total calories: ");
		this.totalCal = in.nextInt();
		System.out.println("Enter the fat calories: ");
		this.fatCal = in.nextInt();
		in.close();

	}

	public void diaplayInfo() {

		System.out.println(this.type);
		System.out.println(this.totalCal);
		System.out.println(this.fatCal);

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTotalCal() {
		return totalCal;
	}

	public void setTotalCal(double totalCal) {
		this.totalCal = totalCal;
	}

	public double getFatCal() {
		return fatCal;
	}

	public void setFatCal(double fatCal) {
		this.fatCal = fatCal;
	}

}
