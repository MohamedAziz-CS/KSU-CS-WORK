/*
 * CSC 111 Phase 1 Project
 * Lab Instructor: Marwan Mohammed K Almaymoni
 * Section Number: 35922 - 50796
 * Students' names:
 * 1. Mohamed Aziz Naji Ali Khelifi   ( 446110130 ) 
 * 2. Faris Abdulkarim Ali Alhuthayli ( 446103489 )
 * 3. Fahad Mamdohe Eisa Almutairi    ( 446104718 )
 */


import java.util.Scanner;

public class ParkingSlotReservationSystem {

	
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);
	
	// defining the parking slots.
	boolean slot1Taken=false;
	boolean slot2Taken=false;
	boolean slot3Taken=false;
	boolean slot4Taken=false;
	boolean slot5Taken=false;
	
	// adding a fixed pricing
	final double ONE_HOUR_PRICE=5.0;
	final double ONE_DAY_PRICE=30.0;
	

	//defining needed variables.
	//this for user choice.
	int choiceNumber=0;
	int choice=0;
	//this for counting how much parks taken and how much left.
	int totalTakenParks=0;
	//this is for the total profit.
	double totalProfit=0.0;
	
	//to count and know the most used option.
	int count1Hour=0;
	int count2Hour=0;
	int count3Hour=0;
	int count4Hour=0;
	int count1Day=0;
	
	// the main do-while loop that is holding the main menu.
	do {
		//printing the Main Menu.
		System.out.println(String.format("\n. ݁₊ ⊹ . ݁ Welcome to the Parking Slot Reservation System ݁ . ⊹ ₊ ݁"));
		System.out.println(String.format("Main Menu:"));
		System.out.println(String.format("1. Customer (Driver)"));
		System.out.println(String.format("2. Parking Administrator (Store Owner)"));
		System.out.println(String.format("3. Exit"));
		System.out.print(String.format("Select an option by typing 1,2 or 3:"));
		choiceNumber=in.nextInt();
		
		
		switch (choiceNumber) {
		
		case 1:
			// this place for part 3 (فارس الهذيلي)
			// defining temporary variables for the current reservation session.
			
			int tempSlot=0;
			int tempDurationChoice=0;
			double tempCost=0;
			boolean isSlotselected=false;
			
			do {
				System.out.println(String.format("\n. ݁₊ ⊹ . ݁ Customer Self-Service Menu ݁ . ⊹ ₊ ݁"));
				System.out.println(String.format("1. Select Parking Slot and Duration"));
				System.out.println(String.format("2. Checkout"));
				System.out.println(String.format("3. Cancel and Return To Main Menu"));
				System.out.print(String.format("Enter Your Desired Choice (1-3): "));
				choice=in.nextInt();
				
				if (choice==1) {
					boolean isAvailable=false;
					do {
					System.out.println(String.format("\nAvailable Parking Slots : "));
					if(!slot1Taken)
						System.out.println(String.format("-Slot ID: 1"));
					if(!slot2Taken)
						System.out.println(String.format("-Slot ID: 2"));
					if(!slot3Taken)
						System.out.println(String.format("-Slot ID: 3"));
					if(!slot4Taken)
						System.out.println(String.format("-Slot ID: 4"));
					if(!slot5Taken)
						System.out.println(String.format("-Slot ID: 5"));
					
					
					System.out.print(String.format("Choose a Parking Slot From The Slots Above: "));
					tempSlot=in.nextInt();
					
					isAvailable=false;
					
					if(tempSlot==1 && !slot1Taken)
						isAvailable=true;
					if(tempSlot==2 && !slot2Taken)
						isAvailable=true;
					if(tempSlot==3 && !slot3Taken)
						isAvailable=true;
					if(tempSlot==4 && !slot4Taken)
						isAvailable=true;
					if(tempSlot==5 && !slot5Taken)
						isAvailable=true;
					
					// Make sure that the selected park slot is not already taken.
					if (!isAvailable) {
						System.out.println(String.format("Invalid Slot ID or Slot is Already occupied Please try again."));
					}
				}while(!isAvailable);
					
					do {
						System.out.println(String.format("\nAvailable Durations :"));
						System.out.println(String.format("1. 1 Hour."));
						System.out.println(String.format("2. 2 Hours."));
						System.out.println(String.format("3. 3 Hours."));
						System.out.println(String.format("4. 4 Hours."));
						System.out.println(String.format("5. A Day."));
						System.out.print(String.format("Choose a Duration (1-5): "));
						tempDurationChoice=in.nextInt();
						
					// Calculating the total cost.	
					if (tempDurationChoice>=1 && tempDurationChoice<=4) {
							tempCost= tempDurationChoice*ONE_HOUR_PRICE;
							isSlotselected=true;
					}
					else if(tempDurationChoice==5) {
							tempCost=ONE_DAY_PRICE;
							isSlotselected=true;
					}
					else {
						System.out.println(String.format("Invalid Duration Choice Please try again."));
					   }
					} while(tempDurationChoice<1||tempDurationChoice>5);
				}
				
				else if (choice==2) {
					// ensure a slot is selected before checkout.
					if(!isSlotselected) {
						System.out.println(String.format("Please select a parking slot and duration first."));
					}
					else {
						String durationName="";
						if (tempDurationChoice == 1)
							durationName = "1 Hour";
						else if (tempDurationChoice == 2)
							durationName = "2 Hours";
						else if (tempDurationChoice == 3) 
							durationName = "3 Hours";
						else if (tempDurationChoice == 4)
							durationName = "4 Hours";
						else if (tempDurationChoice == 5) 
							durationName = "Day Pass";
						
						// display formatted invoice.
						System.out.println(String.format("\n. ݁₊ ⊹ . ݁ Reservation Invoice ݁ . ⊹ ₊ ݁"));
						System.out.println(String.format("Parking Slot ID : %d", tempSlot));
						System.out.println(String.format("Parking Duration: %s", durationName));
						System.out.println(String.format("Total Cost      : %.2f SAR", tempCost));
						int confirm=0;
						do {
							System.out.print(String.format("Confirm reservation? (1:Yes, 2:NO):"));
							confirm=in.nextInt();
							
							if (confirm==1) {
								
								if (tempSlot==1)
									slot1Taken=true;
								if (tempSlot==2)
									slot2Taken=true;
								if (tempSlot==3)
									slot3Taken=true;
								if (tempSlot==4)
									slot4Taken=true;
								if (tempSlot==5)
									slot5Taken=true;
								
								totalProfit+=tempCost;
								totalTakenParks++;
								
								if (tempDurationChoice==1)
									count1Hour++;
								if (tempDurationChoice==2)
									count2Hour++;
								if (tempDurationChoice==3)
									count3Hour++;
								if (tempDurationChoice==4)
									count4Hour++;
								if (tempDurationChoice==5)
									count1Day++;
								System.out.println(String.format("Booking confirmed successfully!"));
								choice=3;
								
							}
							else if(confirm==2) {
								System.out.println(String.format("Reservation cancelled.\n Returning to Main Menu..."));
								choice=3;
							}
							else {
								System.out.println(String.format("Invalid input. Please enter 1 or 2."));
							}
						}while(confirm!=1 && confirm!=2);
					}
				}
				else if (choice != 3) {
					System.out.println(String.format("Invalid choice, try again."));
				}
				
			}while(choice!=3 && totalTakenParks<5);
			
			break;

		case 2:
            //This place for part 4(فهد المطيري)

			 int adminChoice;
			 
			 do {
			        System.out.println(String.format("\n. ݁₊ ⊹ . ݁ ParkingAdministrator Menu ݁ . ⊹ ₊ ݁"));
			        System.out.println(String.format("1. View Total Profit"));
			        System.out.println(String.format("2. View MostPopular Parking Duration"));
			        System.out.println(String.format("3. Return to Main Menu"));
			        System.out.print(String.format("Enter your choice: "));
			        adminChoice = in.nextInt();

					// check input
			        if (adminChoice == 1) {

			            System.out.println(String.format("\n. ݁₊ ⊹ . ݁ ݁ . ⊹ ₊ . ݁₊ ⊹ . ݁"));
			            System.out.println(String.format("Total Profit: %.2f SAR", totalProfit));
			            System.out.println(String.format(". ݁₊ ⊹ . ݁ ݁ . ⊹ ₊ . ݁₊ ⊹ . ݁"));

			        } 
			        else if (adminChoice == 2) {

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
			                System.out.println(String.format("Number of Bookings: %d time(s) ( each if there is more than one ) ", maxCount));
			            }

			            System.out.println(String.format(". ݁₊ ⊹ . ݁ ݁ . ⊹ ₊ . ݁₊ ⊹ . ݁"));

			        } 
			        else if (adminChoice != 3) {
			            System.out.println(String.format("Invalid choice, try again."));
			        }

			    } while (adminChoice != 3);
			    break;
			    	 
		case 3:
			System.out.println(String.format("Closing the Program....."));
			System.out.println(String.format("HAVE A NICE DAY!"));
			break;
		
		default:
			System.out.println(String.format("Invalid option, try again."));
			break;
			
		}
		
	}while(choiceNumber!=3 && totalTakenParks<5);
	
	
	if (totalTakenParks==5) {
		System.out.println(String.format("all parking slot are taken"));
		System.out.println(String.format("Closing the Program....."));
		System.out.println(String.format("HAVE A NICE DAY!"));
	}
	
	
in.close();

	}

}
