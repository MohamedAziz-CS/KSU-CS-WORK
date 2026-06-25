
public class DataUsagePlan {

	private static int numOfPlans = 0;
	private String customerName;
	private String nationalID;
	private String planID;
	private char planType;
	private int usedGB;

	public DataUsagePlan(String Name, String ID, char type, int GB) {

		customerName = Name;
		nationalID = ID;
		planType = type;
		usedGB = GB;
		planID = generatePlanID();
		numOfPlans++;

	}

	private String generatePlanID() {

		String uniquePlanID = ("" + nationalID.charAt(0) + nationalID.charAt(nationalID.length()-1) + planType + numOfPlans);
		return uniquePlanID;
	}

	public static boolean isValidPlanType(char type) {
		switch (type) {

		case 'L':
		case 'S':
		case 'U':
			return true;

		default:
			return false;

		}

	}

	public double calculateTotalCost() {
		double cost = 0;
		switch (planType) {

		case 'L':
			if (usedGB <= 10) {
				cost = 50;
			} else {
				cost = 50 + (usedGB - 10) * 5;
			}
			break;

		case 'S':
			if (usedGB <= 50) {
				cost = 100;
			} else {
				cost = 100 + (usedGB - 50) * 3;
			}
			break;

		case 'U':
			cost = 200;
			break;

		}
		return cost;
	}

	public void displayInfo() {

		System.out
				.println(String.format("Name: %s, National ID: %s, ID: %s, Type: %c, Used GB: %d, Total cost: %.1f SAR",
						customerName, nationalID, planID, planType, usedGB, calculateTotalCost()));
	}

	public static int getNumOfPlans() {
		return numOfPlans;
	}

	public static void setNumOfPlans(int numOfPlans) {
		DataUsagePlan.numOfPlans = numOfPlans;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getPlanID() {
		return planID;
	}

	public void setPlanID(String planID) {
		this.planID = planID;
	}

	public char getPlanType() {
		return planType;
	}

	public void setPlanType(char planType) {
		this.planType = planType;
	}

	public int getUsedGB() {
		return usedGB;
	}

	public void setUsedGB(int usedGB) {
		this.usedGB = usedGB;
	}

}