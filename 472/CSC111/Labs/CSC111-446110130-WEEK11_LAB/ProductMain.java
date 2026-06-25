
public class ProductMain {

	public static void main(String[] args) {
		Product product1 = new Product("Laptop", "Electronics", 50);
		product1.displayInfo();
		product1.setStock(45);
		product1.displayInfo();
	}

}
