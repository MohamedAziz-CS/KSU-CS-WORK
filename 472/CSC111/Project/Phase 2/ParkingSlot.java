/*
 * CSC 111 Phase 2 Project
 * Lab Instructor: Marwan Mohammed K Almaymoni
 * Section Number: 35922 - 50796
 * Students' names:
 * 1. Mohamed Aziz Naji Ali Khelifi   ( 446110130 ) 
 * 2. Faris Abdulkarim Ali Alhuthayli ( 446103489 )
 * 3. Fahad Mamdohe Eisa Almutairi    ( 446104718 )
 */

public class ParkingSlot {

	private int slotId;
	private boolean available;

	public ParkingSlot() {
		slotId = 0;
		available = true;
	}

	public ParkingSlot(int slotId, boolean available) {
		this.slotId = slotId;
		this.available = available;
	}

	// to reserve the slot.
	public void reserve() {
		available = false;
	}

	// to give the availability of the slot.
	public boolean isAvailable() {
			if(this.available==true)
				return true;
			else
				return false;
		}

	// shows if the slot taken or not.
	public void display() {
		if (available == true) {
			System.out.println(String.format("Slot ID: " + slotId + " | Status: Available"));
		} else {
			System.out.println(String.format("Slot ID: " + slotId + " | Status: Occupied"));
		}

	}

	// getter for slot value.
	public int getSlotId() {
		return slotId;
	}

	// setter for slot value.
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	// assign the availability of the slot.
	public void setAvailable(boolean available) {
		this.available = available;
	}

}
