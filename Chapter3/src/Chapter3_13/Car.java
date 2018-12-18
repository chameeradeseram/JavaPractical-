package Chapter3_13;

public class Car {

	private String model;
	private String year;
	private double price;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car(String model, String year, double price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Car(double price) {
		if(price>0){
			this.price = price;
		}
		
	}
	
	public void getDiscount(double discount){
		price=price-discount;
		
	}
	
	
}
