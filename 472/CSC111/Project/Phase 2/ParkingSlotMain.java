/*
 * CSC 111 Phase 2 Project
 * Lab Instructor: Marwan Mohammed K Almaymoni
 * Section Number: 35922 - 50796
 * Students' names:
 * 1. Mohamed Aziz Naji Ali Khelifi   ( 446110130 ) 
 * 2. Faris Abdulkarim Ali Alhuthayli ( 446103489 )
 * 3. Fahad Mamdohe Eisa Almutairi    ( 446104718 )
 */

import java.util.Scanner;

public class ParkingSlotMain {

	static Scanner in = new Scanner(System.in);

	// defining the parking slots.
	ParkingSlot slot1 = new ParkingSlot();
	ParkingSlot slot2 = new ParkingSlot(2, true);
	ParkingSlot slot3 = new ParkingSlot(3, true);
	ParkingSlot slot4 = new ParkingSlot(4, true);
	ParkingSlot slot5 = new ParkingSlot(5, true);

	// adding a fixed pricing
	static final double ONE_HOUR_PRICE = 5.0;
	static final double ONE_DAY_PRICE = 30.0;

	// the total parks taken counter and also the total profit
	static int totalTakenParks = 0;
	static double totalProfit = 0.0;

	// to count and know the most used option.
	static int count1Hour = 0;
	static int count2Hour = 0;
	static int count3Hour = 0;
	static int count4Hour = 0;
	static int count1Day = 0;

	// defining needed variables.
	static int tempSlot = 0;
	static int duration = 0;
	static double tempCost = 0;
	static boolean isSlotselected = false;
	static int choice = 0;

	public static void main(String[] args) {

		ParkingSlotMain system = new ParkingSlotMain();

		system.slot1.setSlotId(1);

		system.displayMenu();

		in.close();

	}

	// Display the main menu to let the user chose from the sub menus.
	public void displayMenu() {

		int choiceNumber = 0;
		do {
			// printing the Main Menu.
			System.out.println(String.format("\n. ݁₊ ⊹ . ݁ Welcome to the Parking Slot Reservation System ݁ . ⊹ ₊ ݁"));
			System.out.println(String.format("Main Menu:"));
			System.out.println(String.format("1. Customer (Driver)"));
			System.out.println(String.format("2. Parking Administrator (Store Owner)"));
			System.out.println(String.format("3. Exit"));
			System.out.print(String.format("Select an option by typing 1,2 or 3:"));
			choiceNumber = in.nextInt();

			switch (choiceNumber) {

			case 1:
				// this place for part 3 (فارس الهذيلي)
				customerMenu();
				break;

			case 2:
				// This place for part 4(فهد المطيري)
				administratorMenu();
				break;

			case 3:
				System.out.println(String.format("Closing the Program....."));
				System.out.println(String.format("HAVE A NICE DAY!"));
				break;

			default:
				System.out.println(String.format("Invalid option, try again."));
				break;

			}

		} while (choiceNumber != 3 && !(allSlotsOccupied()));

		if (totalTakenParks == 5) {
			System.out.println(String.format("all parking slot are taken"));
			System.out.println(String.format("Closing the Program....."));
			System.out.println(String.format("HAVE A NICE DAY!"));
		}

	}

	// the menu where the user chose the available parks and chose duration.
	public void customerMenu() {

		do {
			System.out.println(String.format("\n. ݁₊ ⊹ . ݁ Customer Self-Service Menu ݁ . ⊹ ₊ ݁"));
			System.out.println(String.format("1. Select Parking Slot and Duration"));
			System.out.println(String.format("2. Checkout"));
			System.out.println(String.format("3. Cancel and Return To Main Menu"));
			System.out.print(String.format("Enter Your Desired Choice (1-3): "));

			choice = in.nextInt();

			if (choice == 1) {

				boolean isAvailable = false;
				do {
					System.out.println(String.format("\nAvailable Parking Slots : "));
					if (slot1.isAvailable())
						slot1.display();
					if (slot2.isAvailable())
						slot2.display();
					if (slot3.isAvailable())
						slot3.display();
					if (slot4.isAvailable())
						slot4.display();
					if (slot5.isAvailable())
						slot5.display();

					System.out.print(String.format("Choose a Parking Slot From The Slots Above: "));
					tempSlot = in.nextInt();

					isAvailable = false;

					if (tempSlot == 1 && slot1.isAvailable())
						isAvailable = true;
					if (tempSlot == 2 && slot2.isAvailable())
						isAvailable = true;
					if (tempSlot == 3 && slot3.isAvailable())
						isAvailable = true;
					if (tempSlot == 4 && slot4.isAvailable())
						isAvailable = true;
					if (tempSlot == 5 && slot5.isAvailable())
						isAvailable = true;

					// Make sure that the selected park slot is not already taken.
					if (!isAvailable) {
						System.out.println(
								String.format("Invalid Slot ID or Slot is Already occupied Please try again."));
					}
				} while (!isAvailable);

				do {
					System.out.println(String.format("\nAvailable Durations :"));
					System.out.println(String.format("1. 1 Hour."));
					System.out.println(String.format("2. 2 Hours."));
					System.out.println(String.format("3. 3 Hours."));
					System.out.println(String.format("4. 4 Hours."));
					System.out.println(String.format("5. A Day."));
					System.out.print(String.format("Choose a Duration (1-5): "));
					duration = in.nextInt();

					// Calculating the total cost.
					if (duration >= 1 && duration <= 4) {
						tempCost = duration * ONE_HOUR_PRICE;
						isSlotselected = true;
					} else if (duration == 5) {
						tempCost = ONE_DAY_PRICE;
						isSlotselected = true;
					} else {
						System.out.println(String.format("Invalid Duration Choice Please try again."));
					}
				} while (duration < 1 || duration > 5);
			}

			else if (choice == 2) {

				if (!isSlotselected) {
					System.out.println(String.format("Please select a parking slot and duration first."));
				} else {
					ParkingSlot choseSlot = null;

					if (tempSlot == 1)
						choseSlot = slot1;
					else if (tempSlot == 2)
						choseSlot = slot2;
					else if (tempSlot == 3)
						choseSlot = slot3;
					else if (tempSlot == 4)
						choseSlot = slot4;
					else if (tempSlot == 5)
						choseSlot = slot5;

					generateInvoice(choseSlot, duration);
				}
			}

			else if (choice != 3) {
				System.out.println(String.format("Invalid choice, try again."));
			}

		} while (choice != 3 && !allSlotsOccupied());
	}

	// make the invoice.
	public void generateInvoice(ParkingSlot slot, int duration) {

		String durationName = "";
		if (duration == 1)
			durationName = "1 Hour";
		else if (duration == 2)
			durationName = "2 Hours";
		else if (duration == 3)
			durationName = "3 Hours";
		else if (duration == 4)
			durationName = "4 Hours";
		else if (duration == 5)
			durationName = "Day Pass";

		System.out.println(String.format("\n. ݁₊ ⊹ . ݁ Reservation Invoice ݁ . ⊹ ₊ ݁"));
		System.out.println(String.format("Parking Slot ID : %d", slot.getSlotId()));
		System.out.println(String.format("Parking Duration: %s", durationName));
		System.out.println(String.format("Total Cost      : %.2f SAR", tempCost));

		int confirm = 0;
		do {
			System.out.print(String.format("Confirm reservation? (1:Yes, 2:NO): "));
			confirm = in.nextInt();

			if (confirm == 1) {

				slot.reserve();

				totalProfit += tempCost;
				totalTakenParks++;

				if (duration == 1)
					count1Hour++;
				if (duration == 2)
					count2Hour++;
				if (duration == 3)
					count3Hour++;
				if (duration == 4)
					count4Hour++;
				if (duration == 5)
					count1Day++;

				System.out.println(String.format("Booking confirmed successfully!"));
				choice = 3;
				isSlotselected = false;
			} else if (confirm == 2) {
				System.out.println(String.format("Reservation cancelled.\n Returning to Main Menu..."));
				choice = 3;
				isSlotselected = false;
			} else {
				System.out.println(String.format("Invalid input. Please enter 1 or 2."));
				isSlotselected = false;
			}
		} while (confirm != 1 && confirm != 2);
	}

	// the admin menu.
	public void administratorMenu() {

		int adminChoice;

		do {
			System.out.println(String.format("\n. ݁₊ ⊹ . ݁ ParkingAdministrator Menu ݁ . ⊹ ₊ ݁"));
			System.out.println(String.format("1. View Total Profit"));
			System.out.println(String.format("2. View Most Popular Parking Duration"));
			System.out.println(String.format("3. Return to Main Menu"));
			System.out.print(String.format("Enter your choice: "));
			adminChoice = in.nextInt();

			// Display total profit.
			if (adminChoice == 1) {
				System.out.println(String.format("\n. ݁₊ ⊹ . ݁ ݁ . ⊹ ₊ . ݁₊ ⊹ . ݁"));
				System.out.println(String.format("Total Profit: %.2f SAR", totalProfit));
				System.out.println(String.format(". ݁₊ ⊹ . ݁ ݁ . ⊹ ₊ . ݁₊ ⊹ . ݁"));

				// Display the most chosed durations.
			} else if (adminChoice == 2) {
				displayPopularDuration();
				System.out.println(String.format(". ݁₊ ⊹ . ݁ ݁ . ⊹ ₊ . ݁₊ ⊹ . ݁"));
			} else if (adminChoice != 3) {
				System.out.println(String.format("Invalid choice, try again."));
			}

		} while (adminChoice != 3);
	}

	// shows the most used durations.
	public void displayPopularDuration() {

		int maxCount = count1Hour;

		// checking which is most used
		if (count2Hour > maxCount) {
			maxCount = count2Hour;
		}
		if (count3Hour > maxCount) {
			maxCount = count3Hour;
		}
		if (count4Hour > maxCount) {
			maxCount = count4Hour;
		}
		if (count1Day > maxCount) {
			maxCount = count1Day;
		}

		System.out.println(String.format("\n. ݁₊ ⊹ . ݁ ݁ . ⊹ ₊ . ݁₊ ⊹ . ݁"));

		if (maxCount == 0) {
			System.out.println(String.format("Status: No reservations yet"));
		} else {

			System.out.print(String.format("Most Popular Duration(s): "));

			if (count1Hour == maxCount) {
				System.out.print(String.format("1 Hour "));
			}
			if (count2Hour == maxCount) {
				System.out.print(String.format("2 Hours "));
			}
			if (count3Hour == maxCount) {
				System.out.print(String.format("3 Hours "));
			}
			if (count4Hour == maxCount) {
				System.out.print(String.format("4 Hours "));
			}
			if (count1Day == maxCount) {
				System.out.print(String.format("Day Pass "));
			}

			System.out.println();
			System.out.println(
					String.format("Number of Bookings: %d time(s) ( each if there is more than one ) ", maxCount));
		}
	}

	// check if all parks are taken or not.
	public boolean allSlotsOccupied() {

		if (totalTakenParks == 5)
			return true;
		else
			return false;

	}
}
