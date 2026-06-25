
public class Product {

	private String name;
	private String category;
	private int stock = 0;

	public Product(String name, String category, int stock) {
		this.name = name;
		this.category = category;
		this.stock = stock;
	}

	public void displayInfo() {
		System.out.println(name);
		System.out.println(category);
		System.out.println(stock);
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getStock() {
		return stock;
	}

}
