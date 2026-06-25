import java.util.Scanner;

public class DataUsagePlanDemo {
	public static void main(String[] args) {

		String Name;
		String National_ID;
		char type;
		int usedGB = 0;
		int a = 0;

		Scanner in = new Scanner(System.in);

		do {

			System.out.print("Enter customer name: ");
			Name = in.nextLine();

			if (Name.equals("exit"))
				break;

			System.out.print("Enter National ID: ");
			National_ID = in.nextLine();

			do {
				System.out.print("Enter plan type ('L', 'S', or 'U'): ");
				type = in.nextLine().charAt(0);
				a = 0;
				if (DataUsagePlan.isValidPlanType(type) == true)
					a = 1;
				else
					System.out.println("ERROR: Incorrect plan type. Type can be 'L', 'S', or 'U' only");

			} while (a != 1);

			System.out.print("Enter used GB: ");
			usedGB = in.nextInt();

			DataUsagePlan s1 = new DataUsagePlan(Name, National_ID, type, usedGB);

			s1.displayInfo();

			in.nextLine();
			System.out.println("====================\r\n" + "");

		} while (!(Name.equals("exit")));

		in.close();

	}
}