import java.util.Scanner;

public class GameStroe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double price = 0;
		double total = 0;
		int x = 1;
		int gameCount = 0;
		String choice = "";
		do {
			System.out.println("*******************************************");
			System.out.println("*     Welcome to the Gaming Center :)     *");
			System.out.println("*       ---------------------------       *");
			System.out.println("* 1) add ==> to add a game to inventory	  *");
			System.out.println("* 2) sell ==> to sell games to a customer *");
			System.out.println("* 3) exit ==> to end this program         *");
			System.out.println("*******************************************");
			System.out.print("Enter your option :> ");
			choice = in.next();

			switch (choice) {

			case "add":
				int y = 1;
				while (y > 0) {

					System.out.print("Please, number of games (-1 to end): ");
					y = in.nextInt();
					if (y > 0) {
						gameCount += y;
					}

				}
				break;

			case "sell":
				if (gameCount <= 0) {
					System.out.println("Sorry. There are no more games in store :(");
				} else {
					total = 0;
					String oui = "";
					int i = 1;
					int nowBuy = 0;
					double dis = 0;
					while (i != 0) {

						if (gameCount > 0) {
							System.out.print("Do you want to add a game? ('y' for yes): ");
							oui = in.next();
							switch (oui) {
							case "y":

								System.out.print("Please, enter the price of next game: ");
								price = in.nextDouble();
								gameCount--;
								nowBuy++;
								total += price;

								break;

							default:
								i = 0;

							}
						} else {
							System.out.println("Cannot sell more games. Out of stock :(");
							i = 0;
						}
					}
					System.out.println("Total price before the discount: " + total + "SR");
					if (nowBuy > 2) {
						dis = total * 0.2;
					}

					System.out.println("Your discount is: " + dis + "SR");
					System.out.println("Total price after discount: " + (total - dis) + "SR");

				}
				break;

			case "exit":
				System.out.println("Thanks. Goodbye!");
				x = 3;
				break;

			default:
				System.out.println("Incorrect option");
				break;

			}
			System.out.println("");

		} while (x != 3);
		
		in.close();

	}

}
