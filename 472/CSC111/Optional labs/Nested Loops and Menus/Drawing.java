import java.util.Scanner;

public class Drawing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = 0;
		char ch = '*';
		int w = 0;
		int h = 0;

		do {
			System.out.println("********************************************************");
			System.out.println("* 0- Currently drawing '" + ch + "'. Change it?                 *");
			System.out.println("* 1- Rectangle.          2- Hollow rectangle.          *");
			System.out.println("* 3- Right triangle.     4- Hollow right triangle.     *");
			System.out.println("* 5- Isosceles triangle. 6- Hollow isosceles triangle. *");
			System.out.println("* 7- Diamond.            8- Hollow diamond.            *");
			System.out.println("* 9- Exit.                                             *");
			System.out.println("********************************************************");
			System.out.print("==> ");
			x = in.nextInt();

			switch (x) {

			case 0:
				in.nextLine();
				System.out.print("Enter the new drawing char: ");
				ch = in.nextLine().charAt(0);
				break;

			case 1:
				System.out.print("Enter the height: ");
				h = in.nextInt();
				System.out.print("Enter the width: ");
				w = in.nextInt();
				for (int i = 1; i <= h; i++) {
					for (int j = 1; j <= w; j++)
						System.out.print(ch);
					System.out.println("");
				}
				break;

			case 2:
				System.out.print("Enter the height: ");
				h = in.nextInt();
				System.out.print("Enter the width: ");
				w = in.nextInt();
				for (int i = 1; i <= h; i++) {
					if (i == 1 || i == h) {
						for (int j = 1; j <= w; j++) {

							System.out.print(ch);
						}
					} else {
						System.out.print(ch);
						for (int k = 1; k <= w - 2; k++) {
							System.out.print(" ");
						}
						System.out.print(ch);
					}
					System.out.println("");
				}
				break;

			case 3:
				System.out.print("Enter the height: ");
				h = in.nextInt();
				for (int i = 1; i <= h; i++) {
					for (int j = 1; j <= i; j++)
						System.out.print(ch);
					System.out.println("");
				}
				break;

			case 4:
				System.out.print("Enter the height: ");
				h = in.nextInt();
				for (int i = 1; i <= h; i++) {
					if (i == 1) {
						System.out.print(ch);
					} else if (i == 2) {
						System.out.print(ch);
						System.out.print(ch);
					} else if (i == h) {
						for (int j = 1; j <= h; j++)
							System.out.print(ch);
					} else {
						System.out.print(ch);
						for (int k = i; k >= 3; k--)
							System.out.print(" ");
						System.out.print(ch);
					}
					System.out.println("");
				}
				break;

			case 5:
				System.out.print("Enter the height: ");
				h = in.nextInt();

				for (int i = 1; i <= h; i++) {

					for (int k = h - i; k > 0; k--) {
						System.out.print(" ");

					}
					for (int l = 1; l <= 2 * i - 1; l++)
						System.out.print(ch);

					System.out.println("");

				}
				break;

			case 6:
				System.out.print("Enter the height: ");
				h = in.nextInt();

				for (int i = 1; i <= h; i++) {
					if (i == 1) {
						for (int k = h - i; k > 0; k--) {
							System.out.print(" ");

						}
						System.out.print(ch);
					} else if (i == h) {
						for (int l = 1; l <= 2 * h - 1; l++)
							System.out.print(ch);
					} else {
						for (int k = h - i; k > 0; k--) {
							System.out.print(" ");
						}
						System.out.print(ch);
						for (int v = 1; v <= 2 * (i - 1) - 1; v++) {
							System.out.print(" ");

						}
						System.out.print(ch);

					}
					System.out.println("");
				}
				break;

			case 7:
				System.out.print("Enter the height: ");
				h = in.nextInt();

				for (int i = 1; i <= Math.ceil(h / 2.0); i++) {

					for (int k = (int) ((Math.ceil(h / 2.0)) - i); k > 0; k--) {
						System.out.print(" ");

					}
					for (int l = 1; l <= 2 * i - 1; l++)
						System.out.print(ch);

					System.out.println("");

				}

				for (int i = (int) (h - Math.ceil(h / 2.0)); i >= 1; i--) {

					for (int k = 0; k < (int) ((Math.ceil(h / 2.0)) - i); k++) {
						System.out.print(" ");

					}
					for (int l = 2 * i - 1; l >= 1; l--)
						System.out.print(ch);

					System.out.println("");

				}
				break;

			case 8:

				System.out.print("Enter the height: ");
				h = in.nextInt();

				for (int i = 1; i <= Math.ceil(h / 2.0); i++) {
					if (i == 1) {
						for (int k = (int) ((Math.ceil(h / 2.0)) - i); k > 0; k--) {
							System.out.print(" ");

						}
						System.out.print(ch);
					} else {
						for (int k = (int) ((Math.ceil(h / 2.0)) - i); k > 0; k--) {
							System.out.print(" ");
						}
						System.out.print(ch);
						for (int v = 1; v <= 2 * (i - 1) - 1; v++) {
							System.out.print(" ");

						}
						System.out.print(ch);

					}
					System.out.println("");
				}

				for (int i = (int) (h - Math.ceil(h / 2.0)); i >= 1; i--) {

					if (i == 1) {
						for (int k = (int) ((Math.ceil(h / 2.0)) - i); k > 0; k--) {
							System.out.print(" ");

						}
						System.out.print(ch);
					} else {
						for (int k = (int) ((Math.ceil(h / 2.0)) - i); k > 0; k--) {
							System.out.print(" ");
						}
						System.out.print(ch);
						for (int v = 1; v <= 2 * (i - 1) - 1; v++) {
							System.out.print(" ");

						}
						System.out.print(ch);

					}
					System.out.println("");
				}
				break;

			case 9:
				System.out.println("Closing the program...");
				System.out.println(" Have a nice day!");
				break;

			default:
				System.out.println("Wrong Input!");
				break;

			}

		} while (x != 9);
		in.close();

	}

}
