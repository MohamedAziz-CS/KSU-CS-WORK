import java.util.Scanner;

public class week13 {

	static int num;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of names:  ");
		num = in.nextInt();
		in.nextLine();
		String[] arr = new String[num];
		System.out.println("Enter the names: ");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = in.nextLine();

		}

		System.out.println("Name(s) longer than 5 characters: ");

		String[] x = week13.filterLongNames(arr);

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		in.close();
	}

	public static String[] filterLongNames(String[] arr) {
		int num1 = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].length() > 5)
				num1++;

		}

		String[] newarr = new String[num1];

		for (int i = 0, j = 0; i < arr.length; i++) {

			if (arr[i].length() > 5) {
				newarr[j] = arr[i];
				j++;
			}

		}
		return newarr;

	}

}