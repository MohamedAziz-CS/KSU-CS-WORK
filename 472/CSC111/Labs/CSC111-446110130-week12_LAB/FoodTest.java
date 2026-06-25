
public class FoodTest {

	public static void main(String[] args) {
		Food obj1 = new Food("juice", 200, 20);
		Food obj2 = new Food();
		obj2.readData();
		
		obj1.diaplayInfo();
		obj2.diaplayInfo();
		
		System.out.println("Number of objects of class food is: " + Food.foodCount);

	}
}