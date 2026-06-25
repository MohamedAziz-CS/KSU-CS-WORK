import java.util.Scanner;

public class TopStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int num = in.nextInt();
		int i = 1;
		double score = 0;
		String name = "";
		String nameTwo = "";
		double scoreTwo = 0;
		if (num >= 2) {

			for (i = 1; i <= num; i++) {
				in.nextLine();
				System.out.print("Enter a student name: ");
				String name1 = in.nextLine();
				System.out.print("Enter a student score: ");
				double score1 = in.nextDouble();
				if (score1 > score) {
					score = score1;
					name = name1;
				} else if (score1 > scoreTwo) {
					scoreTwo = score1;
					nameTwo = name1;
				}

			}
			System.out.println("Top two students:");
			System.out.println(name + "'s score is " + (double) score);
			System.out.println(nameTwo + "'s score is " + (double) scoreTwo);
		} else {
			System.out.println("Need at least two students.");
		}
		in.close();
	}

}
