package sell.computer0;

public class Computer {
	public String brand;
	public int price;
	public String generation;
	public int id;
	public String mycom;
	public Computer(int price, String Brand, String gen){
		this.brand = Brand ;
		this.price = price;
		this.generation = gen;
	}
	public Computer() {}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
