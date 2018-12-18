package Chapter3_12;

import java.util.Scanner;

public class PetrolPurchase {

	private String location;
	private String type;
	private int qty;
	private Double price;
	private Double discount;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public PetrolPurchase(String location, String type, int qty, Double price, Double discount) {
		super();
		this.location = location;
		this.type = type;
		this.qty = qty;
		this.price = price;
		this.discount = discount;
	}
	
	
	
	public PetrolPurchase() {
		super();
	}
	public void getPurchase(){
		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter the qty");
		qty=a.nextInt();
	    
		discount=0.5;
		price=100.00;
		
		double amount=(price*qty);
		double netAmount=(amount-discount);
		
		System.out.println(netAmount);
	}
	
}
